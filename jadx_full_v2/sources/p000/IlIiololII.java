            package p000;

            import java.io.File;
            
            public final class IlIiololII extends IlIillI1i0oI {
                public boolean I00000oOI;
                public File[] I0000Il00O;
                public int I0000O;
                public boolean I0000oI00;

                @Override
                public final File I00000oIO() {
                    int i;
/* 1 */             boolean z = this.I0000oI00;
/* 4 */             File file = this.I00000oIO;
/* 6 */             if (!z && this.I0000Il00O == null) {
/* 12 */                File[] fileArrListFiles = file.listFiles();
/* 16 */                this.I0000Il00O = fileArrListFiles;
/* 18 */                if (fileArrListFiles == null) {
/* 20 */                    this.I0000oI00 = true;
                        }
                    }
/* 22 */            File[] fileArr = this.I0000Il00O;
/* 24 */            if (fileArr != null && (i = this.I0000O) < fileArr.length) {
/* 33 */                this.I0000O = i + 1;
/* 35 */                return fileArr[i];
                    }
/* 40 */            if (this.I00000oOI) {
/* 45 */                return null;
                    }
/* 42 */            this.I00000oOI = true;
/* 44 */            return file;
                }
            }
