            package p000;

            import java.io.File;
            
            public final class IlIl0O extends IlIillI1i0oI {
                public boolean I00000oOI;
                public File[] I0000Il00O;
                public int I0000O;

                @Override
                public final File I00000oIO() {
/* 1 */             boolean z = this.I00000oOI;
/* 3 */             File file = this.I00000oIO;
/* 5 */             if (!z) {
/* 8 */                 this.I00000oOI = true;
/* 10 */                return file;
                    }
/* 11 */            File[] fileArrListFiles = this.I0000Il00O;
/* 14 */            if (fileArrListFiles != null && this.I0000O >= fileArrListFiles.length) {
/* 13 */                return null;
                    }
/* 23 */            if (fileArrListFiles == null) {
/* 25 */                fileArrListFiles = file.listFiles();
/* 29 */                this.I0000Il00O = fileArrListFiles;
/* 31 */                if (fileArrListFiles == null || fileArrListFiles.length == 0) {
/* 13 */                    return null;
                        }
                    }
/* 37 */            int i = this.I0000O;
/* 41 */            this.I0000O = i + 1;
/* 43 */            return fileArrListFiles[i];
                }
            }
