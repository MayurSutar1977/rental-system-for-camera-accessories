import styled from "styled-components"

const Container = styled.div`
flex: 1;
display: flex;
margin: 3px;
/* height: 100vh; */
min-width: 280px;
height: 350px;
position: relative;
`
const Image = styled.img`
  width: 100%;
  height: 100%;
  object-fit: cover;
  
`
const ImageInfo = styled.div`
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
`
const Title = styled.h1`
  color: white;
  margin-bottom: 20px;
`
const Button = styled.button`
  border: none;
  padding: 10px;
  background-color: white;
  color: gray;
  cursor: pointer;
  font-weight: 600;
`

const CategoryItem = ({item}) => {
  return (
    <Container>
        <Image src={item.img} alt="image not found"></Image>
        <ImageInfo>
          <Title>{item.title}</Title>
          <Button >SHOP NOW</Button>
        </ImageInfo>
    </Container>
  )
}

export default CategoryItem