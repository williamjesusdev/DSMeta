import nofification from "../../assets/img/notification-icon.svg";

import "./styles.css";

type Props = {
  saleId: Number;
};

function NotificationButton({ saleId }: Props) {
  return (
    <div className="dsmeta-red-btn">
      <img src={nofification} alt="Notificar" />
    </div>
  );
}

export default NotificationButton;
