            package p000;

            import com.google.mlkit.genai.rewriting.zzg;
            
            public final class il1l00IOII {
                public String I00000oIO;
                public int I00000oOI;
                public int I0000Il00O;
                public zzg I0000O;

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 52 */                return true;
                    }
/* 6 */             if (!(obj instanceof il1l00IOII)) {
/* 54 */                return false;
                    }
/* 8 */             il1l00IOII il1l00ioii = (il1l00IOII) obj;
/* 18 */            if (!this.I00000oIO.equals(il1l00ioii.I00000oIO) || this.I00000oOI != il1l00ioii.I00000oOI) {
/* 54 */                return false;
                    }
/* 26 */            zzg zzgVar = this.I0000O;
/* 28 */            zzg zzgVar2 = il1l00ioii.I0000O;
/* 30 */            if (zzgVar == null) {
/* 32 */                if (zzgVar2 != null) {
/* 54 */                    return false;
                        }
                    } else if (zzgVar != zzgVar2) {
/* 54 */                return false;
                    }
/* 42 */            if (this.I0000Il00O != il1l00ioii.I0000Il00O) {
/* 54 */                return false;
                    }
/* 44 */            ii01i1O ii01i1o = ii01i1O.I00000oIO;
                    return ii01i1o.equals(ii01i1o);
                }

                public final int hashCode() {
/* 10 */            int iHashCode = this.I00000oIO.hashCode() ^ 1000003;
/* 11 */            zzg zzgVar = this.I0000O;
/* 38 */            return ((this.I0000Il00O ^ (((((iHashCode * 1000003) ^ this.I00000oOI) * 1000003) ^ (zzgVar == null ? 0 : zzgVar.hashCode())) * 1000003)) * (-721379959)) ^ 1001110;
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
