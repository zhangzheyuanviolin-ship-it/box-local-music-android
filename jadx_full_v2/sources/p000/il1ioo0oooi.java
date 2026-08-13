            package p000;

            import com.google.mlkit.genai.proofreading.zzk;
            
            public final class il1ioo0oooi {
                public String I00000oIO;
                public int I00000oOI;
                public int I0000Il00O;
                public zzk I0000O;

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 52 */                return true;
                    }
/* 6 */             if (!(obj instanceof il1ioo0oooi)) {
/* 54 */                return false;
                    }
/* 8 */             il1ioo0oooi il1ioo0oooiVar = (il1ioo0oooi) obj;
/* 18 */            if (!this.I00000oIO.equals(il1ioo0oooiVar.I00000oIO) || this.I00000oOI != il1ioo0oooiVar.I00000oOI) {
/* 54 */                return false;
                    }
/* 26 */            zzk zzkVar = this.I0000O;
/* 28 */            zzk zzkVar2 = il1ioo0oooiVar.I0000O;
/* 30 */            if (zzkVar == null) {
/* 32 */                if (zzkVar2 != null) {
/* 54 */                    return false;
                        }
                    } else if (zzkVar != zzkVar2) {
/* 54 */                return false;
                    }
/* 42 */            if (this.I0000Il00O != il1ioo0oooiVar.I0000Il00O) {
/* 54 */                return false;
                    }
/* 44 */            ii01OO1110 ii01oo1110 = ii01OO1110.I00000oIO;
                    return ii01oo1110.equals(ii01oo1110);
                }

                public final int hashCode() {
/* 10 */            int iHashCode = this.I00000oIO.hashCode() ^ 1000003;
/* 11 */            zzk zzkVar = this.I0000O;
/* 38 */            return ((this.I0000Il00O ^ (((((iHashCode * 1000003) ^ this.I00000oOI) * 1000003) ^ (zzkVar == null ? 0 : zzkVar.hashCode())) * 1000003)) * (-721379959)) ^ 1001110;
                }

                public final String toString() {
/* 3 */             String strValueOf = String.valueOf(this.I0000O);
/* 11 */            StringBuilder sb = new StringBuilder("MagicRewriteRequest{message=");
/* 16 */            sb.append(this.I00000oIO);
/* 21 */            sb.append(", tone=");
/* 26 */            sb.append(this.I00000oOI);
/* 31 */            sb.append(", streamingCallback=");
/* 34 */            sb.append(strValueOf);
/* 39 */            sb.append(", overrideRequestKind=");
/* 46 */            return IIl001iO0Io.I000lI(this.I0000Il00O, ", maxDecodeSteps=0, userProperties=UserProperties{isMinorUser=false}}", sb);
                }
            }
