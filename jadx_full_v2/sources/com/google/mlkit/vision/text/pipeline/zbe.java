            package com.google.mlkit.vision.text.pipeline;

            import p000.IIlIOloOOO;
            
            final class zbe extends VkpTextRecognizerOptions {
                private final String zba;
                private final String zbb;
                private final String zbc;
                private final boolean zbd;

                public zbe(String str, String str2, String str3, boolean z, zbd zbdVar) {
/* 4 */             this.zba = str;
/* 6 */             this.zbb = str2;
/* 8 */             this.zbc = str3;
/* 10 */            this.zbd = z;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof VkpTextRecognizerOptions) {
/* 10 */                VkpTextRecognizerOptions vkpTextRecognizerOptions = (VkpTextRecognizerOptions) obj;
/* 22 */                if (this.zba.equals(vkpTextRecognizerOptions.zba()) && this.zbb.equals(vkpTextRecognizerOptions.zbc()) && this.zbc.equals(vkpTextRecognizerOptions.zbb()) && this.zbd == vkpTextRecognizerOptions.zbd()) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 38 */            return (true != this.zbd ? 1237 : 1231) ^ ((((((this.zba.hashCode() ^ 1000003) * 1000003) ^ this.zbb.hashCode()) * 1000003) ^ this.zbc.hashCode()) * 1000003);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("VkpTextRecognizerOptions{configLabel=");
/* 10 */            sb.append(this.zba);
/* 15 */            sb.append(", modelDir=");
/* 20 */            sb.append(this.zbb);
/* 25 */            sb.append(", languageHint=");
/* 30 */            sb.append(this.zbc);
/* 35 */            sb.append(", enableLowLatencyInBackground=");
/* 42 */            return IIlIOloOOO.I0010o(sb, this.zbd, "}");
                }

                @Override
                public final String zba() {
/* 1 */             return this.zba;
                }

                @Override
                public final String zbb() {
/* 1 */             return this.zbc;
                }

                @Override
                public final String zbc() {
/* 1 */             return this.zbb;
                }

                @Override
                public final boolean zbd() {
/* 1 */             return this.zbd;
                }
            }
