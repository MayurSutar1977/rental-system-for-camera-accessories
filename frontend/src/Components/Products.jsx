import styled from "styled-components"
import Product from "./Product"
import { popularProducts } from "../data"

const Container = styled.div`
flex-wrap: wrap;
display: flex;
padding: 20px;
justify-content: space-between;
`

const Products = () => {
  return (
    <Container>
        {popularProducts.map(item=>
        (<Product item={item} 
        key={item.id} ></Product>))}
    </Container>
  )
}

export default Products