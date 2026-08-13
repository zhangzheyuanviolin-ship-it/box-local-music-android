            package p000;

            import java.io.File;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public final class i0OIOOi00 {
                public i0Il00O1 I00000oIO;
                public i0O1I1o I00000oOI;
                public i0O0oOiO11 I0000Il00O;
                public i0IOo0i0 I0000O;
                public i0IOo0i0 I0000oI00;

                public final void I00000oIO(i0OIIl i0oiil) {
/* 1 */             i0Il00O1 i0il00o1 = this.I00000oIO;
/* 5 */             String str = (String) i0oiil.I00000oOI;
/* 7 */             int i = i0oiil.I0000O;
/* 9 */             int i2 = i0oiil.I00000oIO;
/* 11 */            int i3 = i0oiil.I0000Il00O;
/* 13 */            long j = i0oiil.I0000oI00;
/* 15 */            File fileI000iOII = i0il00o1.I000iOII(i3, j, str);
/* 23 */            if (!fileI000iOII.exists()) {
/* 186 */               throw new i0O0lI1oiO(IIl001iO0Io.I000oI1ioi("Cannot find pack files to promote for pack ", str, " at ", fileI000iOII.getAbsolutePath()), i2);
                    }
/* 25 */            File fileI000iOII2 = i0il00o1.I000iOII(i, j, str);
/* 29 */            fileI000iOII2.mkdirs();
/* 36 */            if (!fileI000iOII.renameTo(fileI000iOII2)) {
/* 105 */               String absolutePath = fileI000iOII.getAbsolutePath();
/* 109 */               String absolutePath2 = fileI000iOII2.getAbsolutePath();
/* 119 */               StringBuilder sbI00111O = IIl001iO0Io.I00111O("Cannot promote pack ", str, " from ", absolutePath, " to ");
/* 123 */               sbI00111O.append(absolutePath2);
/* 133 */               throw new i0O0lI1oiO(sbI00111O.toString(), i2);
                    }
/* 44 */            Executor executor = (Executor) this.I0000oI00.I0000Il00O();
/* 49 */            IlloOi1I1OO illoOi1I1OO = new IlloOi1I1OO(4);
/* 52 */            illoOi1I1OO.I00iiI = this;
/* 54 */            illoOi1I1OO.I00iiO = i0oiil;
/* 56 */            VarHandle.storeStoreFence();
/* 59 */            executor.execute(illoOi1I1OO);
/* 62 */            i0O1I1o i0o1i1o = this.I00000oOI;
/* 64 */            i0o1i1o.getClass();
/* 69 */            i0O0olI111 i0o0oli111 = new i0O0olI111();
/* 72 */            i0o0oli111.I00iOIl = i0o1i1o;
/* 74 */            i0o0oli111.I00iiI = str;
/* 76 */            i0o0oli111.I00iiO = i;
/* 78 */            i0o0oli111.I00iio = j;
/* 80 */            VarHandle.storeStoreFence();
/* 83 */            i0o1i1o.I00000oOI(i0o0oli111);
/* 88 */            this.I0000Il00O.I00000oOI(str);
/* 99 */            ((i0OiOI1) this.I0000O.I0000Il00O()).I0000Il00O(i2, str);
                }
            }
