            package com.google.mlkit.vision.text.pipeline;

            import com.google.mlkit.vision.text.pipeline.VkpTextRecognizerOptions;
            import p000.I000II;
            import p000.IOOlIIilOl0;
            
            final class zbc extends VkpTextRecognizerOptions.Builder {
                private String zba;
                private String zbb;
                private String zbc;
                private boolean zbd;
                private byte zbe;

                @Override
                public final VkpTextRecognizerOptions build() {
                    String str;
                    String str2;
                    String str3;
/* 4 */             if (this.zbe == 1 && (str = this.zba) != null && (str2 = this.zbb) != null && (str3 = this.zbc) != null) {
/* 24 */                return new zbe(str, str2, str3, this.zbd, null);
                    }
/* 30 */            StringBuilder sb = new StringBuilder();
/* 35 */            if (this.zba == null) {
/* 39 */                sb.append(" configLabel");
                    }
/* 44 */            if (this.zbb == null) {
/* 48 */                sb.append(" modelDir");
                    }
/* 53 */            if (this.zbc == null) {
/* 57 */                sb.append(" languageHint");
                    }
/* 62 */            if (this.zbe == 0) {
/* 66 */                sb.append(" enableLowLatencyInBackground");
                    }
/* 79 */            I000II.I001IO000("Missing required properties:".concat(sb.toString()));
/* 82 */            return null;
                }

                @Override
                public final VkpTextRecognizerOptions.Builder setConfigLabel(String str) {
/* 1 */             if (str != null) {
/* 3 */                 this.zba = str;
/* 5 */                 return this;
                    }
/* 8 */             IOOlIIilOl0.I000II("Null configLabel");
/* 11 */            return null;
                }

                @Override
                public final VkpTextRecognizerOptions.Builder setEnableLowLatencyInBackground(boolean z) {
/* 1 */             this.zbd = z;
/* 4 */             this.zbe = (byte) 1;
/* 49 */            return this;
                }

                @Override
                public final VkpTextRecognizerOptions.Builder setLanguageHint(String str) {
/* 1 */             if (str != null) {
/* 3 */                 this.zbc = str;
/* 5 */                 return this;
                    }
/* 8 */             IOOlIIilOl0.I000II("Null languageHint");
/* 11 */            return null;
                }

                @Override
                public final VkpTextRecognizerOptions.Builder setModelDir(String str) {
/* 1 */             if (str != null) {
/* 3 */                 this.zbb = str;
/* 5 */                 return this;
                    }
/* 8 */             IOOlIIilOl0.I000II("Null modelDir");
/* 11 */            return null;
                }
            }
