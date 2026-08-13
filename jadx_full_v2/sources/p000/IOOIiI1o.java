            package p000;
            
/* 11 */    public final class IOOIiI1o {
                public static final IOOIiI1o I0000oI00 = new IOOIiI1o(null, 15);
                public final Oo0lloOiiIOI I00000oIO;
                public final O1ooiI111i I00000oOI;
                public final Oo0o1OiIo I0000Il00O;
                public final Boolean I0000O;

                public IOOIiI1o(Oo0lloOiiIOI oo0lloOiiIOI, O1ooiI111i o1ooiI111i, Oo0o1OiIo oo0o1OiIo, Boolean bool) {
/* 4 */             this.I00000oIO = oo0lloOiiIOI;
/* 6 */             this.I00000oOI = o1ooiI111i;
/* 8 */             this.I0000Il00O = oo0o1OiIo;
/* 10 */            this.I0000O = bool;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IOOIiI1o)) {
/* 7 */                 return false;
                    }
/* 11 */            IOOIiI1o iOOIiI1o = (IOOIiI1o) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, iOOIiI1o.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, iOOIiI1o.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, iOOIiI1o.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, iOOIiI1o.I0000O);
                }

                public final int hashCode() {
/* 2 */             Oo0lloOiiIOI oo0lloOiiIOI = this.I00000oIO;
/* 12 */            int iHashCode = (oo0lloOiiIOI == null ? 0 : oo0lloOiiIOI.hashCode()) * 31;
/* 14 */            O1ooiI111i o1ooiI111i = this.I00000oOI;
/* 25 */            int iHashCode2 = (iHashCode + (o1ooiI111i == null ? 0 : o1ooiI111i.hashCode())) * 31;
/* 27 */            Oo0o1OiIo oo0o1OiIo = this.I0000Il00O;
/* 40 */            int iHashCode3 = (iHashCode2 + (oo0o1OiIo == null ? 0 : Long.hashCode(oo0o1OiIo.I00000oIO))) * 31;
/* 42 */            Boolean bool = this.I0000O;
/* 51 */            return iHashCode3 + (bool != null ? bool.hashCode() : 0);
                }

                public final String toString() {
/* 48 */            return "CodeBlockStyle(textStyle=" + this.I00000oIO + ", modifier=" + this.I00000oOI + ", padding=" + this.I0000Il00O + ", wordWrap=" + this.I0000O + ")";
                }

/* 12 */        public IOOIiI1o(Oo0lloOiiIOI oo0lloOiiIOI, int i) {
/* 13 */            this((i & 1) != 0 ? null : oo0lloOiiIOI, null, null, null);
                }
            }
