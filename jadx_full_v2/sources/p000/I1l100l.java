            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class I1l100l {
                public int I00000oIO;
                public IIllII I00000oOI;

                public static I1l100l I00000oIO(O0oiOi o0oiOi, IIllII iIllII) {
/* 3 */             int iIdentityHashCode = System.identityHashCode(o0oiOi);
/* 7 */             I1l100l i1l100l = new I1l100l();
/* 10 */            i1l100l.I00000oIO = iIdentityHashCode;
/* 12 */            if (iIllII == null) {
/* 22 */                IOOlIIilOl0.I000II("Null cameraIdentifier");
/* 25 */                return null;
                    }
/* 14 */            i1l100l.I00000oOI = iIllII;
/* 16 */            VarHandle.storeStoreFence();
/* 19 */            return i1l100l;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof I1l100l) {
/* 10 */                I1l100l i1l100l = (I1l100l) obj;
/* 16 */                if (this.I00000oIO == i1l100l.I00000oIO && this.I00000oOI.equals(i1l100l.I00000oOI)) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 14 */            return this.I00000oOI.hashCode() ^ ((this.I00000oIO ^ 1000003) * 1000003);
                }

                public final String toString() {
/* 28 */            return "Key{lifecycleOwnerHash=" + this.I00000oIO + ", cameraIdentifier=" + this.I00000oOI + "}";
                }
            }
