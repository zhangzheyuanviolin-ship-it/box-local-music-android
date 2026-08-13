            package p000;
            
            public final class o00ooO0IO0Oo {
                public lOoo0oiii I00000oIO;
                public i1o0l0i I00000oOI;

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 30 */                return true;
                    }
/* 6 */             if (!(obj instanceof o00ooO0IO0Oo)) {
/* 32 */                return false;
                    }
/* 8 */             o00ooO0IO0Oo o00ooo0io0oo = (o00ooO0IO0Oo) obj;
                    return this.I00000oIO.equals(o00ooo0io0oo.I00000oIO) && this.I00000oOI.equals(o00ooo0io0oo.I00000oOI);
                }

                public final int hashCode() {
/* 10 */            int iHashCode = this.I00000oIO.hashCode() ^ 1000003;
/* 18 */            return this.I00000oOI.hashCode() ^ (iHashCode * 1000003);
                }

                public final String toString() {
/* 3 */             String string = this.I00000oIO.toString();
/* 7 */             int length = string.length();
/* 13 */            String string2 = this.I00000oOI.toString();
/* 28 */            StringBuilder sb = new StringBuilder(length + 53 + string2.length() + 1);
/* 35 */            IIl001iO0Io.I001lIiIIo1O(sb, "ProtoSerializer{defaultValue=", string, ", extensionRegistryLite=", string2);
/* 40 */            sb.append("}");
/* 43 */            return sb.toString();
                }
            }
