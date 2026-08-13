            package p000;

            import com.google.mlkit.genai.summarization.zzg;
            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public final class il1l01I0il {
                public io0o00I1ol1o I00000oIO;
                public int I00000oOI;
                public il111l0o1 I0000Il00O;
                public int I0000O;
                public zzg I0000oI00;

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 65 */                return true;
                    }
/* 6 */             if (!(obj instanceof il1l01I0il)) {
/* 67 */                return false;
                    }
/* 8 */             il1l01I0il il1l01i0il = (il1l01I0il) obj;
/* 18 */            if (!this.I00000oIO.equals(il1l01i0il.I00000oIO) || Float.floatToIntBits(0.0f) != Float.floatToIntBits(0.0f)) {
/* 67 */                return false;
                    }
/* 31 */            zzg zzgVar = this.I0000oI00;
/* 33 */            zzg zzgVar2 = il1l01i0il.I0000oI00;
/* 35 */            if (zzgVar == null) {
/* 37 */                if (zzgVar2 != null) {
/* 67 */                    return false;
                        }
                    } else if (zzgVar != zzgVar2) {
/* 67 */                return false;
                    }
                    return this.I00000oOI == il1l01i0il.I00000oOI && this.I0000Il00O.equals(il1l01i0il.I0000Il00O) && this.I0000O == il1l01i0il.I0000O;
                }

                public final int hashCode() {
/* 17 */            int iHashCode = ((this.I00000oIO.hashCode() ^ 1000003) * 1000003) ^ Float.floatToIntBits(0.0f);
/* 18 */            zzg zzgVar = this.I0000oI00;
/* 60 */            return this.I0000O ^ (((((((((((((((iHashCode * 1000003) ^ 40) * 1000003) ^ 3) * 1000003) ^ Barcode.FORMAT_QR_CODE) * 1000003) ^ (zzgVar == null ? 0 : zzgVar.hashCode())) * (-721379959)) ^ this.I00000oOI) * 1000003) ^ 123) * 1000003) ^ this.I0000Il00O.hashCode()) * 1000003);
                }

                public final String toString() {
/* 1 */             il111l0o1 il111l0o1Var = this.I0000Il00O;
/* 3 */             zzg zzgVar = this.I0000oI00;
/* 7 */             String string = this.I00000oIO.toString();
/* 11 */            String strValueOf = String.valueOf(zzgVar);
/* 15 */            String string2 = il111l0o1Var.toString();
/* 25 */            StringBuilder sbI00111O = IIl001iO0Io.I00111O("SummarizationRequest{messages=", string, ", temperature=0.0, topK=40, targetReplyLengthMin=3, targetReplyLengthMax=256, streamingCallback=", strValueOf, ", taskStateChangeCallback=null, bulletPointNum=");
/* 31 */            sbI00111O.append(this.I00000oOI);
/* 36 */            sbI00111O.append(", rngSeed=123, promptArguments=");
/* 39 */            sbI00111O.append(string2);
/* 44 */            sbI00111O.append(", overrideRequestKind=");
/* 51 */            return IIl001iO0Io.I000lI(this.I0000O, "}", sbI00111O);
                }
            }
