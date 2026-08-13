            package com.google.mlkit.vision.text.pipeline;
            
            public abstract class VkpTextRecognizerOptions {

                public static abstract class Builder {
                    public abstract VkpTextRecognizerOptions build();

                    public abstract Builder setConfigLabel(String str);

                    public abstract Builder setEnableLowLatencyInBackground(boolean z);

                    public abstract Builder setLanguageHint(String str);

                    public abstract Builder setModelDir(String str);
                }

                public static Builder builder(String str, String str2, String str3) {
/* 3 */             zbc zbcVar = new zbc();
/* 6 */             zbcVar.setConfigLabel(str);
/* 9 */             if (str2 == null) {
/* 11 */                str2 = "mlkit-google-ocr-models";
                    }
/* 13 */            zbcVar.setModelDir(str2);
/* 16 */            zbcVar.setLanguageHint(str3);
/* 20 */            zbcVar.setEnableLowLatencyInBackground(false);
/* 215 */           return zbcVar;
                }

                public abstract String zba();

                public abstract String zbb();

                public abstract String zbc();

                public abstract boolean zbd();
            }
