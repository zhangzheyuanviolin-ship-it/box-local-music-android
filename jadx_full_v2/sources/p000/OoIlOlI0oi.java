            package p000;

            import java.io.Closeable;
            import java.io.File;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            
            public final class OoIlOlI0oi implements Closeable {
                public final OOilOo101lI I00iOIl;
                public final int I00iiI;
                public final long[] I00iiO;

                public OoIlOlI0oi(File file) throws IOException {
/* 3 */             OOilOo101lI oOilOo101lI = new OOilOo101lI(file);
/* 9 */             this.I00iOIl = oOilOo101lI;
/* 30 */            if (!new String(oOilOo101lI.I00100l0(4), IO1IOO01oiO.I0000O).equals("ttcf")) {
/* 97 */                IioIoO10iOiI.I000OOo1O("Missing TTC header");
/* 186 */               throw null;
                    }
/* 32 */            float fI001i1lo1io = oOilOo101lI.I001i1lo1io();
/* 40 */            int iI00IoiI = (int) oOilOo101lI.I00IoiI();
/* 41 */            this.I00iiI = iI00IoiI;
/* 43 */            if (iI00IoiI <= 0 || iI00IoiI > 1024) {
/* 91 */                IioIoO10iOiI.I000OOo1O(Oi010OO0.I000oI1ioi(iI00IoiI, "Invalid number of fonts "));
/* 94 */                throw null;
                    }
/* 51 */            this.I00iiO = new long[iI00IoiI];
/* 56 */            for (int i = 0; i < this.I00iiI; i++) {
/* 64 */                this.I00iiO[i] = oOilOo101lI.I00IoiI();
                    }
/* 73 */            if (fI001i1lo1io >= 2.0f) {
/* 75 */                oOilOo101lI.I00OIl();
/* 78 */                oOilOo101lI.I00OIl();
/* 81 */                oOilOo101lI.I00OIl();
                    }
                }

                public final OoIllIioi1l I00000oIO(int i) throws IOException {
/* 1 */             long[] jArr = this.I00iiO;
/* 3 */             long j = jArr[i];
/* 5 */             OOilOo101lI oOilOo101lI = this.I00iOIl;
/* 7 */             oOilOo101lI.I00Ol00(j);
/* 28 */            boolean z = true;
/* 29 */            boolean z2 = false;
/* 40 */            IlOoIo oIOi0Oli = new String(oOilOo101lI.I00100l0(4), IO1IOO01oiO.I0000O).equals("OTTO") ? new OIOi0Oli(z2, z) : new IlOoIo(z2, z);
/* 45 */            oOilOo101lI.I00Ol00(jArr[i]);
/* 50 */            OlliIio olliIio = new OlliIio();
/* 53 */            olliIio.I00iOIl = oOilOo101lI;
/* 55 */            VarHandle.storeStoreFence();
/* 58 */            return oIOi0Oli.I0000Il00O(olliIio);
                }

                @Override
                public final void close() {
/* 3 */             this.I00iOIl.close();
                }
            }
