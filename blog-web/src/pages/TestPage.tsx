import axios from 'axios';

const call = async () => {
  await axios
    .get('...')
    .then((res) => {
      console.log('success');
    })
    .catch((error) => {
      console.log('error');
    })
    .then(() => {
      console.log('always run');
    });
};

const Test = () => {
  call();
  console.log('after Call');
  return <></>;
};

export default Test;
