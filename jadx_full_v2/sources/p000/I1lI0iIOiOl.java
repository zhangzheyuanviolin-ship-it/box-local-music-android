            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class I1lI0iIOiOl {
                public String I00000oIO;
                public int I00000oOI;
                public String I0000Il00O;
                public String I0000O;
                public long I0000oI00;
                public long I0001Ioi1lo;
                public String I000II;
                public byte I000O01llI0;

                public final I1lI11 I00000oIO() {
/* 4 */             if (this.I000O01llI0 != 3 || this.I00000oOI == 0) {
/* 50 */                StringBuilder sb = new StringBuilder();
/* 55 */                if (this.I00000oOI == 0) {
/* 59 */                    sb.append(" registrationStatus");
                        }
/* 66 */                if ((this.I000O01llI0 & 1) == 0) {
/* 70 */                    sb.append(" expiresInSecs");
                        }
/* 77 */                if ((this.I000O01llI0 & 2) == 0) {
/* 81 */                    sb.append(" tokenCreationEpochInSecs");
                        }
/* 86 */                IoOOl0iOl1io.I000OOo1O("Missing required properties:", sb);
/* 89 */                return null;
                    }
/* 13 */            String str = this.I00000oIO;
/* 15 */            int i = this.I00000oOI;
/* 17 */            String str2 = this.I0000Il00O;
/* 19 */            String str3 = this.I0000O;
/* 21 */            long j = this.I0000oI00;
/* 23 */            long j2 = this.I0001Ioi1lo;
/* 25 */            String str4 = this.I000II;
/* 27 */            I1lI11 i1lI11 = new I1lI11();
/* 30 */            i1lI11.I00000oIO = str;
/* 32 */            i1lI11.I00000oOI = i;
/* 34 */            i1lI11.I0000Il00O = str2;
/* 36 */            i1lI11.I0000O = str3;
/* 38 */            i1lI11.I0000oI00 = j;
/* 40 */            i1lI11.I0001Ioi1lo = j2;
/* 42 */            i1lI11.I000II = str4;
/* 44 */            VarHandle.storeStoreFence();
/* 47 */            return i1lI11;
                }
            }
