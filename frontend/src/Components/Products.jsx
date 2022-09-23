import styled from "styled-components"
import Product from "./Product"
// import { popularProducts } from "../data"
import { useEffect, useState } from "react"
import productService from "../services/product-service"

const Container = styled.div`
flex-wrap: wrap;
display: flex;
padding: 20px;
justify-content: space-between;
`

const Products = () => {

  const [products, setProducts] = useState([]);

  const init = () => {
    productService.getAll()
    .then(response => {
      console.log('Printing product data', response.data);
      setProducts(response.data);
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
        {products.map(item=>
        (<Product item={item} 
        key={item.id} ></Product>))}
    </Container>
  )
}

export default Products