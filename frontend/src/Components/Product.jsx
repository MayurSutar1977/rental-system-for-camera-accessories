import FavoriteBorderOutlinedIcon from '@mui/icons-material/FavoriteBorderOutlined';
import SearchOutlinedIcon from '@mui/icons-material/SearchOutlined';
import ShoppingCartOutlinedIcon from '@mui/icons-material/ShoppingCartOutlined';
import styled from "styled-components"
import {useNavigate} from 'react-router-dom';

const ImageInfo = styled.div`
    opacity: 0;
    width: 100%;
    height: 100%;
    position: absolute;
    top: 0;
    left: 0;
    background-color: rgba(0,0,0,0.2);
    z-index: 3;
    display: flex;
    align-items: center;
    justify-content: center;
    transition: all 0.5s ease;
    cursor: pointer;
`

const Container = styled.div`
flex: 1;
margin: 5px;
min-width: 280px;
height: 350px;
display: flex;
align-items: center;
justify-content: center;
position: relative;
background-color: #f5fbfd;
border: 2px solid black;

&:hover ${ImageInfo}{
    opacity: 1;
}
`

const Circle = styled.div`
    width: 200px;
    height: 200px;
    border-radius: 50%;
    background-color: white;
    position: absolute;
`

const Image = styled.img`
height: 75%;
z-index: 2;
`



const Icon = styled.div`
    width: 40px;
    height: 40px;
    border-radius: 50% ;
    background-color: white;
    display: flex;
    align-items: center;
    justify-content: center;
    margin: 10px;
    transition: all 0.5s ease;

    &:hover{
        background-color: #e9f5f5;
        transform : scale(1.1);
    }

`

const Product = ({item}) => {
    
    const navigate = useNavigate();

    const showProduct = (id) => {
        let url = "/products/"+id;
        navigate(url);
    }

  return (
    <Container>
        <Circle></Circle>
            <Image src={item.image} alt="image not found"></Image>
            <ImageInfo>
                <Icon>
                    <ShoppingCartOutlinedIcon></ShoppingCartOutlinedIcon>
                </Icon>
                <Icon>
                    <SearchOutlinedIcon onClick={()=>showProduct(item.id)}></SearchOutlinedIcon>
                </Icon>
                <Icon>
                    <FavoriteBorderOutlinedIcon></FavoriteBorderOutlinedIcon>
                </Icon>
            </ImageInfo>
    </Container>
  )
}

export default Product