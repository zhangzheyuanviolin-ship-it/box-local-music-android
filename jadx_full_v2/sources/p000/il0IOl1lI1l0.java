            package p000;

            import android.content.Context;
            import java.io.File;
            
            public abstract class il0IOl1lI1l0 {
                public static final File I00000oIO(Context context, String str) {
/* 17 */            return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(str));
                }
            }
