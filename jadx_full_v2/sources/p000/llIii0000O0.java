            package p000;

            import java.util.Objects;
            
            public final class llIii0000O0 {
                public boolean I00000oIO;
                public IoillO0OOoo I00000oOI;
                public i1lIIl01O I0000Il00O;
                public String I0000O;
                public String I0000oI00;
                public IoillO0OOoo I0001Ioi1lo;
                public IoillO0OOoo I000II;
                public boolean I000O01llI0;
                public boolean I000OOo1O;
                public boolean I000OiO;
                public lOl0ioO11 I000iOII;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 120 */               return true;
                    }
/* 7 */             if (!(obj instanceof llIii0000O0)) {
/* 118 */               return false;
                    }
/* 11 */            llIii0000O0 lliii0000o0 = (llIii0000O0) obj;
                    return this.I00000oIO == lliii0000o0.I00000oIO && this.I00000oOI.equals(lliii0000o0.I00000oOI) && this.I0000Il00O.equals(lliii0000o0.I0000Il00O) && this.I0000O.equals(lliii0000o0.I0000O) && this.I0000oI00.equals(lliii0000o0.I0000oI00) && this.I0001Ioi1lo.equals(lliii0000o0.I0001Ioi1lo) && this.I000II.equals(lliii0000o0.I000II) && this.I000O01llI0 == lliii0000o0.I000O01llI0 && this.I000OOo1O == lliii0000o0.I000OOo1O && this.I000OiO == lliii0000o0.I000OiO && this.I000iOII.equals(lliii0000o0.I000iOII);
                }

                public final int hashCode() {
/* 41 */            return Objects.hash(Boolean.valueOf(this.I00000oIO), this.I00000oOI, this.I0000Il00O, this.I0000O, this.I0000oI00, this.I0001Ioi1lo, this.I000II, Boolean.valueOf(this.I000O01llI0), Boolean.valueOf(this.I000OOo1O), Boolean.valueOf(this.I000OiO));
                }

                public final String toString() {
/* 3 */             boolean z = this.I00000oIO;
/* 9 */             int length = String.valueOf(z).length();
/* 13 */            IoillO0OOoo ioillO0OOoo = this.I00000oOI;
/* 19 */            int length2 = String.valueOf(ioillO0OOoo).length();
/* 23 */            i1lIIl01O i1liil01o = this.I0000Il00O;
/* 29 */            int length3 = String.valueOf(i1liil01o).length();
/* 33 */            String str = this.I0000O;
/* 35 */            int length4 = str.length();
/* 39 */            String str2 = this.I0000oI00;
/* 41 */            int length5 = str2.length();
/* 45 */            IoillO0OOoo ioillO0OOoo2 = this.I0001Ioi1lo;
/* 51 */            int length6 = String.valueOf(ioillO0OOoo2).length();
/* 55 */            IoillO0OOoo ioillO0OOoo3 = this.I000II;
/* 61 */            int length7 = String.valueOf(ioillO0OOoo3).length();
/* 65 */            boolean z2 = this.I000O01llI0;
/* 71 */            int length8 = String.valueOf(z2).length();
/* 77 */            boolean z3 = this.I000OOo1O;
/* 83 */            int length9 = String.valueOf(z3).length();
/* 89 */            boolean z4 = this.I000OiO;
/* 95 */            int length10 = String.valueOf(z4).length();
/* 99 */            lOl0ioO11 lol0ioo11 = this.I000iOII;
/* 153 */           StringBuilder sb = new StringBuilder(length + 59 + length2 + 9 + length3 + 10 + length4 + 17 + length5 + 30 + length6 + 30 + length7 + 24 + length8 + 26 + length9 + 20 + length10 + 14 + String.valueOf(lol0ioo11).length() + 1);
/* 158 */           sb.append("SharedStorageInfo(shouldUseSharedStorage=");
/* 161 */           sb.append(z);
/* 166 */           sb.append(", enabledBackings=");
/* 169 */           sb.append(ioillO0OOoo);
/* 174 */           sb.append(", secret=");
/* 177 */           sb.append(i1liil01o);
/* 182 */           sb.append(", dirPath=");
/* 185 */           sb.append(str);
/* 190 */           sb.append(", gmsCoreDirPath=");
/* 193 */           sb.append(str2);
/* 198 */           sb.append(", includeStaticConfigPackages=");
/* 201 */           sb.append(ioillO0OOoo2);
/* 206 */           sb.append(", excludeStaticConfigPackages=");
/* 209 */           sb.append(ioillO0OOoo3);
/* 214 */           sb.append(", hasStorageInfoFromGms=");
/* 217 */           sb.append(z2);
/* 222 */           sb.append(", allowEmptySnapshotToken=");
/* 225 */           sb.append(z3);
/* 230 */           sb.append(", enableCommitV2Api=");
/* 233 */           sb.append(z4);
/* 238 */           sb.append(", clientFlags=");
/* 241 */           sb.append(lol0ioo11);
/* 246 */           sb.append(")");
/* 249 */           return sb.toString();
                }
            }
