import React from 'react';
import axios from 'axios';

interface User {
  email: string;
  password: string;
}

const JoinPage = () => {
  const doSignUp = async () => {
    try {
      let inputValue: User = { email: '1234@example.com', password: 'pd' };
      const { data } = await axios.post(
        'http://localhost:7777/join',
        inputValue,
      );
    } catch (error) {
      console.log(error);
    }
  };

  return (
    <div>
      <div>
        <span>이메일:</span>
        <input name="email" />
      </div>
      <div>
        <span>PW:</span>
        <input name="password" type="password" />
      </div>
    </div>
  );
};

export default JoinPage;
