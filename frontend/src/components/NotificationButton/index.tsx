import { Dispatch, SetStateAction, useState } from "react";
import axios from "axios";

import { BASE_URL } from "../../utils/request";
import NotificationIcon from "../NotificationIcon";

import "./styles.css";

type Props = {
  saleId: number;
};

type SendNotificationProps = {
  saleId: number;
  setSent: Dispatch<SetStateAction<string>>;
};

function sendNotification({ saleId, setSent }: SendNotificationProps) {
  axios
    .get(`${BASE_URL}/sales/${saleId}/notification`)
    .then(() => setSent("sent"));
}

function NotificationButton({ saleId }: Props) {
  const [sent, setSent] = useState("");
  return (
    <div
      className={`dsmeta-red-btn ${sent}`}
      onClick={() => sendNotification({ saleId, setSent })}
    >
      <NotificationIcon />
    </div>
  );
}

export default NotificationButton;
