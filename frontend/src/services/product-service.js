import httpClient from '../http-common-products';

const getAll = () => {
  return httpClient.get('/fetch-all-equipments');
};

const create = (data) => {
  return httpClient.post('', data);
};

const get = (id) => {
  return httpClient.get(`/get-equipment-by-id/${id}`);
};

const update = (data) => {
  return httpClient.put('', data);
};

const remove = (id) => {
  return httpClient.delete(`/${id}`);
};

const productServices = { getAll, create, get, update, remove }

export default productServices;
