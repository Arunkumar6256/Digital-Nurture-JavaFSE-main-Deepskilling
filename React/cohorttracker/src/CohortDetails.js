import styles from "./CohortDetails.module.css";

function CohortDetails({ cohort }) {

    return (

        <div className={styles.box}>

            <h3
                style={{
                    color:
                        cohort.status === "ongoing"
                            ? "green"
                            : "blue"
                }}
            >
                {cohort.status}
            </h3>

            <dl>

                <dt>Name</dt>
                <dd>{cohort.name}</dd>

                <dt>Coach</dt>
                <dd>{cohort.coach}</dd>

            </dl>

        </div>

    );

}
export default CohortDetails;