import React from 'react'
import { BrowserRouter, Route, Switch } from 'react-router-dom';

const LoginPage = React.lazy(() => import('./pages/LoginPage'));
const DashboardPage = React.lazy(() => import('./pages/DashboardPage'));
const AccountPage = React.lazy(() => import('./pages/AccountPage'));
const StudentPage = React.lazy(() => import('./pages/StudentPage'));
const RoomPage = React.lazy(() => import('./pages/RoomPage'));
const ContractPage = React.lazy(() => import('./pages/ContractPage'));
const UtilityBillPage = React.lazy(() => import('./pages/UtilityBillPage'));
const ServicePage = React.lazy(() => import('./pages/ServicePage'));
const ReportPage = React.lazy(() => import('./pages/ReportPage'));

const getBasename = () => {
    return `/${process.env.PUBLIC_URL.split('/').pop()}`;
  };
  
function App() {
    return (
        <BrowserRouter basename={getBasename()}>
            <Switch>
                <React.Suspense fallback={<div>Loading...</div>}>
                    <Route exact path="/" component={LoginPage} />
                    <Route exact path="/dashboard" component={DashboardPage} />
                    <Route exact path="/profile" component={AccountPage} />
                    <Route exact path="/students" component={StudentPage} />
                    <Route exact path="/rooms" component={RoomPage} />
                    <Route exact path="/contracts" component={ContractPage} />
                    <Route exact path="/utility-bills" component={UtilityBillPage} />
                    <Route exact path="/services" component={ServicePage} />
                    <Route exact path="/reports" component={ReportPage} />
                </React.Suspense>
            </Switch>
        </BrowserRouter>
    );
}  

export default App;
