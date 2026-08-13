            package p000;

            import java.io.File;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public final class i0O1oI1l0l {
                public i0Il00O1 I00000oIO;
                public i0O1I1o I00000oOI;
                public i0O0oOiO11 I0000Il00O;
                public i0OI1IOoili1 I0000O;
                public i0IOo0i0 I0000oI00;
                public i0IOo0i0 I0001Ioi1lo;

                public final void I00000oIO(i0O1o10oo i0o1o10oo) {
/* 1 */             i0Il00O1 i0il00o1 = this.I00000oIO;
/* 5 */             String str = (String) i0o1o10oo.I00000oOI;
/* 7 */             int i = i0o1o10oo.I00000oIO;
/* 9 */             int i2 = i0o1o10oo.I0000Il00O;
/* 11 */            long j = i0o1o10oo.I0000O;
/* 13 */            i0il00o1.getClass();
/* 24 */            File file = new File(i0il00o1.I0000Il00O(i2, j, str), "_packs");
/* 42 */            File file2 = new File(new File(i0il00o1.I0000Il00O(i2, j, str), "_slices"), "_metadata");
/* 49 */            if (!file.exists() || !file2.exists()) {
/* 966 */               throw new i0O0lI1oiO(IlIi0I0.I000lI("Cannot find pack files to move for pack ", str, "."), i);
                    }
/* 57 */            File fileI000iOII = i0il00o1.I000iOII(i2, j, str);
/* 61 */            fileI000iOII.mkdirs();
/* 68 */            if (!file.renameTo(fileI000iOII)) {
/* 218 */               throw new i0O0lI1oiO("Cannot move merged pack files to final location.", i);
                    }
/* 81 */            new File(i0il00o1.I000iOII(i2, j, str), "merge.tmp").delete();
/* 90 */            File file3 = new File(i0il00o1.I000iOII(i2, j, str), "_metadata");
/* 93 */            file3.mkdirs();
/* 100 */           if (!file2.renameTo(file3)) {
/* 210 */               throw new i0O0lI1oiO("Cannot move metadata files to final location.", i);
                    }
                    try {
/* 115 */               this.I0000O.I00000oOI((String) i0o1o10oo.I00000oOI, i0o1o10oo.I0000Il00O, i0o1o10oo.I0000O, i0o1o10oo.I0000oI00);
/* 124 */               Executor executor = (Executor) this.I0001Ioi1lo.I0000Il00O();
/* 129 */               IlloOIoilIl illoOIoilIl = new IlloOIoilIl(4);
/* 132 */               illoOIoilIl.I00iiI = this;
/* 134 */               illoOIoilIl.I00iiO = i0o1o10oo;
/* 136 */               VarHandle.storeStoreFence();
/* 139 */               executor.execute(illoOIoilIl);
/* 142 */               i0O1I1o i0o1i1o = this.I00000oOI;
/* 144 */               i0o1i1o.getClass();
/* 149 */               i0O0olI111 i0o0oli111 = new i0O0olI111();
/* 152 */               i0o0oli111.I00iOIl = i0o1i1o;
/* 154 */               i0o0oli111.I00iiI = str;
/* 156 */               i0o0oli111.I00iiO = i2;
/* 158 */               i0o0oli111.I00iio = j;
/* 160 */               VarHandle.storeStoreFence();
/* 163 */               i0o1i1o.I00000oOI(i0o0oli111);
/* 168 */               this.I0000Il00O.I00000oOI(str);
/* 179 */               ((i0OiOI1) this.I0000oI00.I0000Il00O()).I0000Il00O(i, str);
                    } catch (IOException e) {
/* 202 */               throw new i0O0lI1oiO(IIl001iO0Io.I000oI1ioi("Could not write asset pack version tag for pack ", str, ": ", e.getMessage()), i);
                    }
                }
            }
