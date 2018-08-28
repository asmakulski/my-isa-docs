#!/bin/bash

echo "removing evaluation key"
rm ~/.IntelliJIdea2018.2/config/eval/idea182.evaluation.key

echo "resetting evalsprt in options.xml"
sed -i '/evlsprt/d' ~/.IntelliJIdea2018.2/config/options/options.xml

echo "resetting evalsprt in prefs.xml"
sed -i '/evlsprt/d' ~/.java/.userPrefs/prefs.xml
