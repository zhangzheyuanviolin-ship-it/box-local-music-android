            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class I1lI0I0i1 {
                public long I00000oIO;
                public I1lO11 I00000oOI;
                public I1l0Ioi01 I0000Il00O;

                public static I1lI0I0i1 I00000oIO(long j, I1lO11 i1lO11, I1l0Ioi01 i1l0Ioi01) {
/* 3 */             I1lI0I0i1 i1lI0I0i1 = new I1lI0I0i1();
/* 6 */             i1lI0I0i1.I00000oIO = j;
/* 9 */             if (i1lO11 == null) {
/* 29 */                IOOlIIilOl0.I000II("Null transportContext");
/* 8 */                 return null;
                    }
/* 11 */            i1lI0I0i1.I00000oOI = i1lO11;
/* 13 */            if (i1l0Ioi01 == null) {
/* 23 */                IOOlIIilOl0.I000II("Null event");
/* 8 */                 return null;
                    }
/* 15 */            i1lI0I0i1.I0000Il00O = i1l0Ioi01;
/* 17 */            VarHandle.storeStoreFence();
/* 20 */            return i1lI0I0i1;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof I1lI0I0i1) {
/* 10 */                I1lI0I0i1 i1lI0I0i1 = (I1lI0I0i1) obj;
/* 18 */                if (this.I00000oIO == i1lI0I0i1.I00000oIO && this.I00000oOI.equals(i1lI0I0i1.I00000oOI) && this.I0000Il00O.equals(i1lI0I0i1.I0000Il00O)) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 1 */             long j = this.I00000oIO;
/* 28 */            return this.I0000Il00O.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.I00000oOI.hashCode()) * 1000003);
                }

                public final String toString() {
/* 38 */            return "PersistedEvent{id=" + this.I00000oIO + ", transportContext=" + this.I00000oOI + ", event=" + this.I0000Il00O + "}";
                }
            }
