            package p000;
            
            public final class Ii0l0ll1 {
                public O1ol100o0O I00000oIO;
                public IllOOo00lI I00000oOI;
                public String I0000Il00O;
                public boolean I0000O;
                public boolean I0000oI00;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 59 */                return true;
                    }
/* 6 */             if (!(obj instanceof Ii0l0ll1)) {
/* 57 */                return false;
                    }
/* 9 */             Ii0l0ll1 ii0l0ll1 = (Ii0l0ll1) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, ii0l0ll1.I00000oIO) && this.I00000oOI.equals(ii0l0ll1.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, ii0l0ll1.I0000Il00O) && this.I0000O == ii0l0ll1.I0000O && this.I0000oI00 == ii0l0ll1.I0000oI00;
                }

                public final int hashCode() {
/* 17 */            int iHashCode = (this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31;
/* 18 */            String str = this.I0000Il00O;
/* 42 */            return Boolean.hashCode(this.I0000oI00) + Oi010OO0.I000OOo1O((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.I0000O);
                }

                public final String toString() {
/* 1 */             O1ol100o0O o1ol100o0O = this.I00000oIO;
/* 3 */             IllOOo00lI illOOo00lI = this.I00000oOI;
/* 5 */             String str = this.I0000Il00O;
/* 7 */             boolean z = this.I0000O;
/* 9 */             boolean z2 = this.I0000oI00;
/* 15 */            StringBuilder sb = new StringBuilder("CustomTaskDataForBuiltinTask(modelManagerViewModel=");
/* 18 */            sb.append(o1ol100o0O);
/* 23 */            sb.append(", onNavUp=");
/* 26 */            sb.append(illOOo00lI);
/* 31 */            sb.append(", conversationId=");
/* 34 */            sb.append(str);
/* 39 */            sb.append(", autoResumeConversation=");
/* 42 */            sb.append(z);
/* 47 */            sb.append(", autoStartVoice=");
/* 52 */            return IIlIOloOOO.I0010o(sb, z2, ")");
                }
            }
