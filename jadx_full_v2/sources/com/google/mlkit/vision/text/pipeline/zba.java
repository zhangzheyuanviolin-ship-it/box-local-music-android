            package com.google.mlkit.vision.text.pipeline;

            import p000.IIl001iO0Io;
            import p000.IIlIOloOOO;
            import p000.IOOlIIilOl0;
            import p000.i10I10;
            import p000.i10iollO00;
            
            final class zba extends zbn {
                private final zbo zba;
                private final i10iollO00 zbb;
                private final i10I10 zbc;
                private final boolean zbd;

                public zba(zbo zboVar, i10iollO00 i10iollo00, i10I10 i10i10, boolean z) {
/* 4 */             this.zba = zboVar;
/* 6 */             this.zbb = i10iollo00;
/* 8 */             if (i10i10 == null) {
/* 17 */                IOOlIIilOl0.I000II("Null lineBoxParcels");
/* 483 */               throw null;
                    }
/* 10 */            this.zbc = i10i10;
/* 12 */            this.zbd = z;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof zbn) {
/* 10 */                zbn zbnVar = (zbn) obj;
/* 22 */                if (this.zba.equals(zbnVar.zbc()) && this.zbb.equals(zbnVar.zbb()) && this.zbc.equals(zbnVar.zba()) && this.zbd == zbnVar.zbd()) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 38 */            return (true != this.zbd ? 1237 : 1231) ^ ((((((this.zba.hashCode() ^ 1000003) * 1000003) ^ this.zbb.hashCode()) * 1000003) ^ this.zbc.hashCode()) * 1000003);
                }

                public final String toString() {
/* 1 */             i10I10 i10i10 = this.zbc;
/* 3 */             i10iollO00 i10iollo00 = this.zbb;
/* 7 */             String string = this.zba.toString();
/* 11 */            String string2 = i10iollo00.toString();
/* 15 */            String string3 = i10i10.toString();
/* 25 */            StringBuilder sbI00111O = IIl001iO0Io.I00111O("VkpResults{status=", string, ", textParcel=", string2, ", lineBoxParcels=");
/* 29 */            sbI00111O.append(string3);
/* 34 */            sbI00111O.append(", fromColdCall=");
/* 41 */            return IIlIOloOOO.I0010o(sbI00111O, this.zbd, "}");
                }

                @Override
                public final i10I10 zba() {
/* 1 */             return this.zbc;
                }

                @Override
                public final i10iollO00 zbb() {
/* 1 */             return this.zbb;
                }

                @Override
                public final zbo zbc() {
/* 1 */             return this.zba;
                }

                @Override
                public final boolean zbd() {
/* 1 */             return this.zbd;
                }
            }
