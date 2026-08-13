            package p000;
            
            public final class I10lool01 {
                public final O0IOli0o0 I00000oIO;
                public final Object I00000oOI;

                public I10lool01(OiO1O1lil10 oiO1O1lil10) {
/* 7 */             O0IOli0o0 o0IOli0o0I00000oOI = OOoOl0i.I00000oIO.I00000oOI(oiO1O1lil10.getClass());
/* 11 */            Object key = oiO1O1lil10.getKey();
/* 18 */            this.I00000oIO = o0IOli0o0I00000oOI;
/* 20 */            this.I00000oOI = key;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof I10lool01)) {
/* 7 */                 return false;
                    }
/* 11 */            I10lool01 i10lool01 = (I10lool01) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, i10lool01.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, i10lool01.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "AnimatedSceneKey(clazz=" + this.I00000oIO + ", key=" + this.I00000oOI + ')';
                }
            }
