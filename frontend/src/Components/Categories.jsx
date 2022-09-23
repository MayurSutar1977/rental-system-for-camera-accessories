import { useEffect, useState } from "react";
import styled from "styled-components";
// import { categories } from "../data";
import { mobile } from "../responsive";
import categoryService from "../services/category-service";
import CategoryItem from "./CategoryItem";

const Container = styled.div`
  display: flex;
  flex-wrap: wrap;
  padding: 20px;
  justify-content: space-between;
  ${mobile({ padding: "0px", flexDirection:"column" })}
`;

const Categories = () => {

  const [categories, setCategories] = useState([]);

  const init = () => {
    categoryService.getAll()
    .then(response => {
      console.log('Printing product data', response.data);
      setCategories(response.data);
    })
    .catch(error => {
      console.log('Something went wrong', error);
    }) 
  }

  useEffect(() => {
    init();
  }, []);

  return (
    <Container>
        {categories.map(item=>(<CategoryItem item={item} key={item.id}></CategoryItem>)
        )}
    </Container>
  )
}

export default Categories