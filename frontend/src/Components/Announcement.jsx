import styled from "styled-components"
import CurrencyRupeeIcon from '@mui/icons-material/CurrencyRupee';

const Container = styled.div`
    height: 30px;
    background-color: teal;
    color: white;
    display: flex;
    align-items: center;
    justify-content: center;
    font-size: 14;
    font-weight: 500;
`

const Announcement = () => {
  return (
    <Container>
        Super Deal! Free shipping on Order on Orders over &nbsp;<CurrencyRupeeIcon style={{ fontSize: 14 }} ></CurrencyRupeeIcon>500
    </Container>
  )
}

export default Announcement