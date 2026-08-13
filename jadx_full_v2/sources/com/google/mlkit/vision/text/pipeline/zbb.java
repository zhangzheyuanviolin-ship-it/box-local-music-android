            package com.google.mlkit.vision.text.pipeline;

            import p000.i101olIl0OiI;
            
            final class zbb extends zbo {
                private final int zba;
                private final i101olIl0OiI zbb;

                public zbb(int i, i101olIl0OiI i101olil0oii) {
/* 4 */             this.zba = i;
/* 6 */             this.zbb = i101olil0oii;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof zbo) {
/* 10 */                zbo zboVar = (zbo) obj;
/* 18 */                if (this.zba == zboVar.zba() && this.zbb.equals(zboVar.zbb())) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 1 */             int i = this.zba;
/* 14 */            return this.zbb.hashCode() ^ ((i ^ 1000003) * 1000003);
                }

                public final String toString() {
/* 32 */            return "VkpStatus{exceptionType=" + this.zba + ", remoteException=" + this.zbb.toString() + "}";
                }

                @Override
                public final int zba() {
/* 1 */             return this.zba;
                }

                @Override
                public final i101olIl0OiI zbb() {
/* 1 */             return this.zbb;
                }
            }
