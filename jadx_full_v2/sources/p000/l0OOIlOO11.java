            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class l0OOIlOO11 {
                public String I00000oIO;
                public float I00000oOI;
                public int I0000Il00O;
                public l0Il1Ooi I0000O;
                public lOI1lll1l10 I0000oI00;

                public static l0OOIlOO11 I00000oIO(String str, float f, int i, l0Il1Ooi l0il1ooi, List list) {
                    lOI1lll1l10 loi1lll1l10I000o00OoI0I;
/* 3 */             if (list == null) {
/* 5 */                 lO1loOl0O0O lo1lool0o0o = lOI1lll1l10.I00iiI;
/* 7 */                 loi1lll1l10I000o00OoI0I = lOl10OOloi.I00ilI0I1;
                    } else {
/* 10 */                loi1lll1l10I000o00OoI0I = lOI1lll1l10.I000o00OoI0I(list);
                    }
/* 14 */            l0OOIlOO11 l0ooiloo11 = new l0OOIlOO11();
/* 18 */            if (str == null) {
/* 44 */                IOOlIIilOl0.I000II("Null text");
/* 17 */                return null;
                    }
/* 20 */            l0ooiloo11.I00000oIO = str;
/* 22 */            l0ooiloo11.I00000oOI = f;
/* 24 */            l0ooiloo11.I0000Il00O = i;
/* 26 */            l0ooiloo11.I0000O = l0il1ooi;
/* 28 */            if (loi1lll1l10I000o00OoI0I == null) {
/* 38 */                IOOlIIilOl0.I000II("Null functionCalls");
/* 17 */                return null;
                    }
/* 30 */            l0ooiloo11.I0000oI00 = loi1lll1l10I000o00OoI0I;
/* 32 */            VarHandle.storeStoreFence();
/* 35 */            return l0ooiloo11;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof l0OOIlOO11) {
/* 10 */                l0OOIlOO11 l0ooiloo11 = (l0OOIlOO11) obj;
/* 20 */                if (this.I00000oIO.equals(l0ooiloo11.I00000oIO) && Float.floatToIntBits(this.I00000oOI) == Float.floatToIntBits(l0ooiloo11.I00000oOI) && this.I0000Il00O == l0ooiloo11.I0000Il00O) {
/* 42 */                    l0Il1Ooi l0il1ooi = this.I0000O;
/* 44 */                    l0Il1Ooi l0il1ooi2 = l0ooiloo11.I0000O;
/* 46 */                    if (l0il1ooi != null ? l0il1ooi.equals(l0il1ooi2) : l0il1ooi2 == null) {
/* 66 */                        if (this.I0000oI00.equals(l0ooiloo11.I0000oI00)) {
/* 1 */                             return true;
                                }
                            }
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 18 */            int iHashCode = ((this.I00000oIO.hashCode() ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.I00000oOI);
/* 19 */            l0Il1Ooi l0il1ooi = this.I0000O;
/* 42 */            return this.I0000oI00.hashCode() ^ (((((iHashCode * 1000003) ^ this.I0000Il00O) * 1000003) ^ (l0il1ooi == null ? 0 : l0il1ooi.hashCode())) * 1000003);
                }

                public final String toString() {
/* 1 */             lOI1lll1l10 loi1lll1l10 = this.I0000oI00;
/* 5 */             String strValueOf = String.valueOf(this.I0000O);
/* 9 */             String string = loi1lll1l10.toString();
/* 13 */            float f = this.I00000oOI;
/* 19 */            int length = String.valueOf(f).length();
/* 23 */            int i = this.I0000Il00O;
/* 29 */            int length2 = String.valueOf(i).length();
/* 33 */            int length3 = strValueOf.length();
/* 37 */            int length4 = string.length();
/* 43 */            String str = this.I00000oIO;
/* 63 */            StringBuilder sb = new StringBuilder(str.length() + 22 + length + 13 + length2 + 19 + length3 + 16 + length4 + 1);
/* 68 */            sb.append("LlmReply{text=");
/* 71 */            sb.append(str);
/* 76 */            sb.append(", score=");
/* 79 */            sb.append(f);
/* 84 */            sb.append(", stopReason=");
/* 87 */            sb.append(i);
/* 92 */            sb.append(", citationMetadata=");
/* 95 */            sb.append(strValueOf);
/* 102 */           return IIlIOloOOO.I0010I0i(sb, ", functionCalls=", string, "}");
                }
            }
