            package p000;

            import android.net.Uri;
            import android.text.TextUtils;
            import java.io.File;
            
            public abstract class ll10II0o1 {
                public static final File I00000oIO(Uri uri) throws IOO1IOl1O10 {
/* 11 */            if (!uri.getScheme().equals("file")) {
/* 77 */                throw new IOO1IOl1O10("Scheme must be 'file'");
                    }
/* 21 */            if (!TextUtils.isEmpty(uri.getQuery())) {
/* 58 */                throw new IOO1IOl1O10("Did not expect uri to have query");
                    }
/* 31 */            if (TextUtils.isEmpty(uri.getAuthority())) {
/* 39 */                return new File(uri.getPath());
                    }
/* 50 */            throw new IOO1IOl1O10("Did not expect uri to have authority");
                }
            }
