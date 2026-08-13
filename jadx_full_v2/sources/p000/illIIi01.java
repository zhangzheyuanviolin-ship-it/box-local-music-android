            package p000;

            import android.os.ParcelFileDescriptor;
            
            public final class illIIi01 {
                public ParcelFileDescriptor I00000oIO;
                public String I00000oOI;
                public OoIol00Ool I0000Il00O;

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 53 */                return true;
                    }
/* 6 */             if (!(obj instanceof illIIi01)) {
/* 55 */                return false;
                    }
/* 8 */             illIIi01 illiii01 = (illIIi01) obj;
/* 18 */            if (!this.I00000oIO.equals(illiii01.I00000oIO) || Float.floatToIntBits(0.0f) != Float.floatToIntBits(0.0f)) {
/* 55 */                return false;
                    }
/* 31 */            String str = this.I00000oOI;
/* 33 */            String str2 = illiii01.I00000oOI;
/* 35 */            if (str == null) {
/* 37 */                if (str2 != null) {
/* 55 */                    return false;
                        }
                    } else if (!str.equals(str2)) {
/* 55 */                return false;
                    }
                    return this.I0000Il00O == illiii01.I0000Il00O;
                }

                public final int hashCode() {
/* 17 */            int iHashCode = ((this.I00000oIO.hashCode() ^ (-721379959)) * (-721379959)) ^ Float.floatToIntBits(0.0f);
/* 18 */            String str = this.I00000oOI;
/* 58 */            return this.I0000Il00O.hashCode() ^ (((((((((((iHashCode * 1000003) ^ 1) * 1000003) ^ 500) * 1000003) ^ 1) * (-429739981)) ^ 2) * 1000003) ^ (str == null ? 0 : str.hashCode())) * 583896283);
                }

                public final String toString() {
/* 3 */             String string = this.I00000oIO.toString();
/* 7 */             int length = string.length();
/* 13 */            String strValueOf = String.valueOf(this.I0000Il00O);
/* 22 */            int length2 = String.valueOf(0.0f).length();
/* 31 */            int length3 = String.valueOf(1).length();
/* 41 */            int length4 = String.valueOf(500).length();
/* 49 */            int length5 = String.valueOf(1).length();
/* 53 */            String str = this.I00000oOI;
/* 88 */            StringBuilder sb = new StringBuilder(length + 118 + length2 + 7 + length3 + 23 + length4 + 13 + length5 + 131 + String.valueOf(str).length() + 66 + strValueOf.length() + 1);
/* 95 */            IIl001iO0Io.I001lIiIIo1O(sb, "CortanaRequest{messages=null, cortanaStateFileDescriptorToWrite=", string, ", cortanaStateFileDescriptorsToRead=null, temperature=0.0, topK=1, targetReplyLengthMax=500, numSamples=1, streamingCallback=null, preferredImageWidth=0, preferredImageHeight=0, numSoftTokens=0, cortanaType=PREFIX_CACHING, systemPrompt=", str);
/* 102 */           return IIlIOloOOO.I0010I0i(sb, ", textToMemory=null, tokenOffset=0, inferenceStateCachingCallback=", strValueOf, "}");
                }
            }
