import Header from './Header';
import Footer from './Footer';

const Layout = (props: { children: React.ReactNode }) => {
  return (
    <div className="row">
      <Header />
      <main>{props.children}</main>
      <Footer />
    </div>
  );
};

export default Layout;
