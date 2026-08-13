            package p000;

            import java.io.File;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            
/* 6 */     public final class OOilOo101lI extends IoiOloi {
                public IIIIiiioo I00iOIl;
                public final File I00iiI;

                public OOilOo101lI(File file) {
/* 5 */             this.I00iOIl = null;
/* 7 */             this.I00iiI = null;
/* 13 */            IIIIiiioo iIIIiiioo = new IIIIiiioo(file, "r");
/* 17 */            iIIIiiioo.I00iiI = 0;
/* 19 */            iIIIiiioo.I00iiO = 0;
/* 23 */            iIIIiiioo.I00iio = 0L;
/* 29 */            iIIIiiioo.I00iOIl = new byte[16384];
/* 31 */            VarHandle.storeStoreFence();
/* 34 */            this.I00iOIl = iIIIiiioo;
/* 36 */            this.I00iiI = file;
                }

                @Override
                public final long I000II() {
/* 3 */             return this.I00iOIl.getFilePointer();
                }

                @Override
                public final long I000l1() {
/* 3 */             return this.I00iiI.length();
                }

                @Override
                public final long I00IOO() {
/* 3 */             return this.I00iOIl.readLong();
                }

                @Override
                public final short I00IioO0OiOi() {
/* 3 */             return this.I00iOIl.readShort();
                }

                @Override
                public final int I00OIl() {
/* 3 */             return this.I00iOIl.readUnsignedShort();
                }

                @Override
                public final void I00Ol00(long j) throws IOException {
/* 3 */             this.I00iOIl.seek(j);
                }

                @Override
                public final void close() throws IOException {
/* 1 */             IIIIiiioo iIIIiiioo = this.I00iOIl;
/* 3 */             if (iIIIiiioo != null) {
/* 5 */                 iIIIiiioo.close();
/* 9 */                 this.I00iOIl = null;
                    }
                }

                @Override
                public final int read() {
/* 3 */             return this.I00iOIl.read();
                }

                @Override
/* 7 */         public final int read(byte[] bArr, int i, int i2) {
/* 8 */             return this.I00iOIl.read(bArr, i, i2);
                }
            }
