#!/bin/bash
set -euo pipefail

SLACKWEBHOOKURL="<WEBHOOK_URL>"

function print_slack_message() {

cat <<-SLACK
            {
              "username": "Playwright Bot",
              "blocks": [
              		{
              			"type": "section",
              			"text": {
              				"type": "mrkdwn",
              				"text": "Jenkins Pipeline execution RESULTS -->"
              			},
              			"accessory": {
              				"type": "button",
              				"text": {
              					"type": "plain_text",
              					"text": "Allure report Build Number ${BUILD_NUMBER}",
              					"emoji": true
              				},
              				"url": "${JOB_URL}${BUILD_NUMBER}/allure/"
              			}
              		}
              ]
            }
SLACK

}

curl -X POST                                           \
        --data-urlencode "payload=$(print_slack_message)"  \
        "$SLACKWEBHOOKURL"