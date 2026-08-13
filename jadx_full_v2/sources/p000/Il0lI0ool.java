            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class Il0lI0ool {
                public O0IOli0o0 I00000oIO;
                public Function1 I00000oOI;
                public Function1 I0000Il00O;
                public IOii1l I0000O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof Il0lI0ool) {
/* 11 */                Il0lI0ool il0lI0ool = (Il0lI0ool) obj;
                        return O0000Ioio00.I0000O(this.I00000oIO, il0lI0ool.I00000oIO) && this.I00000oOI.equals(il0lI0ool.I00000oOI) && this.I0000Il00O.equals(il0lI0ool.I0000Il00O) && this.I0000O == il0lI0ool.I0000O;
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 33 */            return this.I0000O.hashCode() + ((this.I0000Il00O.hashCode() + ((this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31)) * 31);
                }

                public final String toString() {
/* 48 */            return "EntryClassProvider(clazz=" + this.I00000oIO + ", clazzContentKey=" + this.I00000oOI + ", metadata=" + this.I0000Il00O + ", content=" + this.I0000O + ')';
                }
            }
