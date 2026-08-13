            package p000;

            import android.app.Activity;
            import kotlin.Metadata;
            
            @OII1IiiII("activity")
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LI0III01lOo;", "LOII1Il1IlOO;", "LI0II1o0IOO;", "navigation-runtime_release"}, m18k = 1, mv = {2, 0, 0}, xi = 48)
            public class I0III01lOo extends OII1Il1IlOO {
                public Activity I0000Il00O;

                @Override
                public final OI1ilOI1ioo0 I00000oIO() {
/* 3 */             return new I0II1o0IOO(this);
                }

                @Override
                public final OI1ilOI1ioo0 I0000Il00O(OI1ilOI1ioo0 oI1ilOI1ioo0) {
/* 29 */            throw new IllegalStateException(IIl001iO0Io.I000lI(((I0II1o0IOO) oI1ilOI1ioo0).I00iiI.I00000oOI, " does not have an Intent set.", new StringBuilder("Destination ")).toString());
                }

                @Override
                public final boolean I0001Ioi1lo() {
/* 1 */             Activity activity = this.I0000Il00O;
/* 3 */             if (activity == null) {
/* 10 */                return false;
                    }
/* 5 */             activity.finish();
/* 8 */             return true;
                }
            }
