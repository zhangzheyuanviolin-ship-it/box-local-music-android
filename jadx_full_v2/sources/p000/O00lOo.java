            package p000;

            import android.content.Context;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class O00lOo {
                public static final O0O00I1Ili[] I0000O = {OOoOl0i.I00000oIO.I000OOo1O(new OOOOIOiI0(IIiO01.I00iiI, O00lOo.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};
                public final String I00000oIO;
                public final ThreadLocal I00000oOI = new ThreadLocal();
                public final Ii1I1ooo10O0 I0000Il00O;

                public O00lOo(Context context, String str) {
/* 4 */             this.I00000oIO = str;
/* 18 */            O00lIli0 o00lIli0 = new O00lIli0(0);
/* 21 */            o00lIli0.I00iiI = this;
/* 23 */            VarHandle.storeStoreFence();
/* 28 */            IIloOI iIloOI = new IIloOI(23);
/* 31 */            iIloOI.I00iiI = o00lIli0;
/* 33 */            VarHandle.storeStoreFence();
/* 39 */            O00lIli0 o00lIli02 = new O00lIli0(1);
/* 42 */            o00lIli02.I00iiI = this;
/* 44 */            VarHandle.storeStoreFence();
/* 47 */            IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 59 */            IIOlO1ii iIOlO1iiI00000oIO = il001oo1.I00000oIO(iiollilo0IO1.I00000oIO(Ii1oo1ooill0.I00iiI, lOi1li0o0.I00000oIO()));
/* 65 */            O0o0ill01o0 o0o0ill01o0 = new O0o0ill01o0(1);
/* 68 */            o0o0ill01o0.I00000oOI = str;
/* 72 */            Object obj = new Object();
/* 75 */            o0o0ill01o0.I0000Il00O = obj;
/* 77 */            VarHandle.storeStoreFence();
/* 82 */            O0O00I1Ili o0O00I1Ili = I0000O[0];
/* 86 */            OOI01lli1 oOI01lli1 = (OOI01lli1) o0o0ill01o0.I0000O;
/* 88 */            if (oOI01lli1 == null) {
                        synchronized (obj) {
                            try {
/* 95 */                        if (((OOI01lli1) o0o0ill01o0.I0000O) == null) {
/* 97 */                            Context applicationContext = context.getApplicationContext();
/* 105 */                           List list = (List) o00lIli02.invoke(applicationContext);
/* 111 */                           O1l110o o1l110o = new O1l110o(11);
/* 114 */                           o1l110o.I00iiI = applicationContext;
/* 116 */                           o1l110o.I00iiO = o0o0ill01o0;
/* 118 */                           VarHandle.storeStoreFence();
/* 123 */                           OOI0ilOI1oI oOI0ilOI1oI = OOI0ilOI1oI.I00000oIO;
/* 128 */                           OIOo1iiI oIOo1iiI = new OIOo1iiI(4);
/* 131 */                           oIOo1iiI.I00iiI = o1l110o;
/* 133 */                           VarHandle.storeStoreFence();
/* 153 */                           o0o0ill01o0.I0000O = new OOI01lli1(new OOI01lli1(IOO0o0I1l.I00000oIO(new IlIi11li(oOI0ilOI1oI, oIOo1iiI), iIloOI, list, iIOlO1iiI00000oIO)));
                                }
/* 161 */                       oOI01lli1 = (OOI01lli1) o0o0ill01o0.I0000O;
                            } catch (Throwable th) {
/* 166 */                       throw th;
                            }
                        }
                    }
/* 167 */           this.I0000Il00O = oOI01lli1;
                }

                public final void I00000oIO(Function1 function1) {
                }
            }
