            package p000;

            import android.net.Uri;
            import androidx.core.content.FileProvider;
            import java.io.File;
            import java.io.IOException;
            import java.util.HashMap;
            
            public final class IlIi000IOo {
                public String I00000oIO;
                public HashMap I00000oOI;

                public final File I00000oIO(Uri uri) throws IOException {
/* 1 */             String encodedPath = uri.getEncodedPath();
/* 8 */             int iIndexOf = encodedPath.indexOf(47, 1);
/* 14 */            if (iIndexOf == -1) {
/* 103 */               IioIoO10iOiI.I000OiO("Unable to find path from root: ", uri);
/* 13 */                return null;
                    }
/* 20 */            String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
/* 29 */            String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
/* 39 */            File file = (File) this.I00000oOI.get(strDecode);
/* 41 */            if (file == null) {
/* 97 */                IioIoO10iOiI.I000OiO("Unable to find configured root for ", uri);
/* 13 */                return null;
                    }
/* 45 */            File file2 = new File(file, strDecode2);
                    try {
/* 48 */                File canonicalFile = file2.getCanonicalFile();
/* 78 */                if (FileProvider.I0000oI00(canonicalFile.getPath()).startsWith(FileProvider.I0000oI00(file.getPath()).concat("/"))) {
/* 80 */                    return canonicalFile;
                        }
/* 88 */                throw new SecurityException("Resolved path jumped beyond configured root");
                    } catch (IOException unused) {
/* 91 */                IioIoO10iOiI.I000OiO("Failed to resolve canonical path for ", file2);
/* 13 */                return null;
                    }
                }
            }
