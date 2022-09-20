import styled from "styled-components"
import CurrencyRupeeIcon from '@mui/icons-material/CurrencyRupee';
import { mobile } from "../responsive";

const Container = styled.div`
    height: 30px;
    display: flex;
    background-color: teal;
    position: relative;
`
const Slider = styled.div`
    height: 100%;
    width : 100%;
    position: absolute;

    animation-name: scroll;
    animation-duration: 15s;
    animation-iteration-count: infinite;

    @keyframes scroll 
    {
    0% {transform: translateX(0)}
    100% {transform: translateX(-100%)}
    }
`

const Info = styled.div`
    height: 100%;
    width : 100%;
    display: flex;
    align-items: center;
    justify-content: right;
    color: white;
    font-size: 14;
    font-weight: 500;
    ${mobile({ fontSize: 12 })}
`

const Announcement = () => {
  return (
    <Container>
      <Slider>
        <Info>
        Super Deal! Free shipping on Order on Orders over &nbsp;<CurrencyRupeeIcon style={{ fontSize: 14 }} ></CurrencyRupeeIcon>500
        </Info>
      </Slider>
    </Container>
  )
}

export default Announcement