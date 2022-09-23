import Home from "./Pages/Home";
import NotFound from "./Pages/NotFound";
import Product from "./Pages/Product";
import { BrowserRouter, Routes, Route } from 'react-router-dom';

const App = () => {
  return (
    <BrowserRouter>
      {/* <div>
        <div> */}
          <Routes> {/* Switch */}
            {/* <Route exact path="/" component={Home} /> */}
            <Route path="/" element={<Home/>} exact />
            <Route path="/home" element={<Home/>} exact />

            {/* <Route path="/Product" component={Product} /> */}
            {/* <Route path="/products" element={<Product/>} exact >
             <Route path=":id" element={<Product />} />
            </Route>   */}
            <Route path="/products/:id" element={<Product />} exact/>

            {/* <Route path="/products/:id">
              <Product />
            </Route>  */}

            {/* <Route path="/employees/edit/:id" component={AddEmployee} /> */}

            {/* <Route path="*" component={NotFound} /> */}
            <Route path="*" element={<NotFound/>} exact />
          </Routes>
        {/* </div>
      </div> */}
    </BrowserRouter>
  );
  
};

export default App;