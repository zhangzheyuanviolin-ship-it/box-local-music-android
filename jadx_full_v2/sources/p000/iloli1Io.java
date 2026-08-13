            package p000;
            
            public final class iloli1Io implements io0lI0 {
                public io0lI0[] I00000oIO;

                @Override
                public final ioIloOilIii zzb(Class cls) {
/* 3 */             for (int i = 0; i < 2; i++) {
/* 7 */                 io0lI0 io0li0 = this.I00000oIO[i];
/* 13 */                if (io0li0.zzc(cls)) {
/* 15 */                    return io0li0.zzb(cls);
                        }
                    }
/* 33 */            OoOil11Ol1o.I000OiO("No factory is available for message type: ".concat(cls.getName()));
/* 36 */            return null;
                }

                @Override
                public final boolean zzc(Class cls) {
/* 4 */             for (int i = 0; i < 2; i++) {
/* 14 */                if (this.I00000oIO[i].zzc(cls)) {
/* 16 */                    return true;
                        }
                    }
/* 1 */             return false;
                }
            }
