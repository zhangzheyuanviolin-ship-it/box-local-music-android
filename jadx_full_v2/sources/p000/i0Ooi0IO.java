            package p000;

            import android.os.DeadObjectException;
            import android.os.RemoteException;
            import com.google.android.gms.common.api.Status;
            import java.lang.invoke.VarHandle;
            import java.util.Map;
            
            public final class i0Ooi0IO extends i0OlOlO {
                public IoilIilo I00000oOI;
                public OloIlI0ll I0000Il00O;
                public lolIo0 I0000O;

                @Override
                public final IlIII1l[] I00000oIO(i0Ol1Ool00 i0ol1ool00) {
/* 5 */             return (IlIII1l[]) this.I00000oOI.I00000oOI;
                }

                @Override
                public final boolean I00000oOI(i0Ol1Ool00 i0ol1ool00) {
/* 3 */             return this.I00000oOI.I0000O;
                }

                @Override
                public final int I0000Il00O(i0Ol1Ool00 i0ol1ool00) {
/* 3 */             return this.I00000oOI.I0000Il00O;
                }

                @Override
                public final void I0000O(Status status) {
/* 1 */             lolIo0 lolio0 = this.I0000O;
/* 3 */             OloIlI0ll oloIlI0ll = this.I0000Il00O;
/* 5 */             lolio0.getClass();
/* 23 */            oloIlI0ll.I0000Il00O(status.I00iiO != null ? new I1O10lli(status) : new I11OiOl(status));
                }

                @Override
                public final void I0000oI00(Exception exc) {
/* 3 */             this.I0000Il00O.I0000Il00O(exc);
                }

                @Override
                public final void I0001Ioi1lo(OoIol00Ool ooIol00Ool, boolean z) {
/* 1 */             OloIlI0ll oloIlI0ll = this.I0000Il00O;
/* 11 */            ((Map) ooIol00Ool.I00iiO).put(oloIlI0ll, Boolean.valueOf(z));
/* 14 */            o0IiOl o0iiol = oloIlI0ll.I00000oIO;
/* 19 */            OoIol00Ool ooIol00Ool2 = new OoIol00Ool(6);
/* 22 */            ooIol00Ool2.I00iiI = oloIlI0ll;
/* 24 */            ooIol00Ool2.I00iiO = ooIol00Ool;
/* 26 */            VarHandle.storeStoreFence();
/* 29 */            o0iiol.I000OiO(ooIol00Ool2);
                }

                @Override
                public final void I000II(i0Ol1Ool00 i0ol1ool00) throws DeadObjectException {
/* 1 */             OloIlI0ll oloIlI0ll = this.I0000Il00O;
                    try {
/* 7 */                 this.I00000oOI.I0001Ioi1lo(i0ol1ool00.I000O01llI0, oloIlI0ll);
                    } catch (DeadObjectException e) {
/* 29 */                throw e;
                    } catch (RemoteException e2) {
/* 23 */                I0000O(i0OlOlO.I000O01llI0(e2));
                    } catch (RuntimeException e3) {
/* 15 */                oloIlI0ll.I0000Il00O(e3);
                    }
                }
            }
