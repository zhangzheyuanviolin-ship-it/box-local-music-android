            package p000;

            import android.content.res.Resources;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.ArrayAdapter;
            import android.widget.TextView;
            import java.util.ArrayList;
            import org.xmlpull.v1.XmlPullParser;
            
            public final class li0iI0O0I0l extends ArrayAdapter {
                public final liii0ioI I00000oIO;

                /* JADX WARN: Illegal instructions before constructor call */
                public li0iI0O0I0l(liii0ioI liii0ioi, Ill0oOi0 ill0oOi0) {
/* 1 */             this.I00000oIO = liii0ioi;
/* 3 */             OoIOol ooIOol = liii0ioi.I0111i;
/* 7 */             Resources resources = (Resources) ooIOol.I00iiI;
/* 11 */            String str = (String) ooIOol.I00iiO;
/* 38 */            super(ill0oOi0, resources.getIdentifier("libraries_social_licenses_license", "layout", str), ((Resources) ooIOol.I00iiI).getIdentifier("license", "id", str), new ArrayList());
                }

                @Override
                public final View getView(int i, View view, ViewGroup viewGroup) {
/* 1 */             liii0ioI liii0ioi = this.I00000oIO;
/* 3 */             if (view == null) {
/* 5 */                 LayoutInflater layoutInflaterI001lllioOl = liii0ioi.I010OIo1l;
/* 7 */                 if (layoutInflaterI001lllioOl == null) {
/* 10 */                    layoutInflaterI001lllioOl = liii0ioi.I001lllioOl(null);
/* 14 */                    liii0ioi.I010OIo1l = layoutInflaterI001lllioOl;
                        }
/* 16 */                OoIOol ooIOol = liii0ioi.I0111i;
/* 20 */                Resources resources = (Resources) ooIOol.I00iiI;
/* 39 */                view = layoutInflaterI001lllioOl.inflate((XmlPullParser) resources.getXml(resources.getIdentifier("libraries_social_licenses_license", "layout", (String) ooIOol.I00iiO)), viewGroup, false);
                    }
/* 47 */            o00i1olooO o00i1olooo = (o00i1olooO) getItem(i);
/* 49 */            if (o00i1olooo != null) {
/* 51 */                OoIOol ooIOol2 = liii0ioi.I0111i;
/* 77 */                ((TextView) view.findViewById(((Resources) ooIOol2.I00iiI).getIdentifier("license", "id", (String) ooIOol2.I00iiO))).setText(o00i1olooo.I00iOIl);
                    }
/* 98 */            return view;
                }
            }
