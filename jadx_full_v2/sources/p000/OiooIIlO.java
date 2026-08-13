            package p000;

            import android.content.Context;
            import android.content.SharedPreferences;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.Set;
            
            public final class OiooIIlO {
                public Ii1lIO I00000oIO;
                public Ii1iii100O1O I00000oOI;
                public Context I0000Il00O;
                public String I0000O;
                public OllO00oiil I0000oI00;
                public Set I0001Ioi1lo;

                /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(Object obj, IOoilo iOoilo) throws Throwable {
                    OiooII oiooII;
/* 1 */             OllO00oiil ollO00oiil = this.I0000oI00;
/* 5 */             if (iOoilo instanceof OiooII) {
/* 8 */                 oiooII = (OiooII) iOoilo;
/* 10 */                int i = oiooII.I00iiO;
/* 16 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 19 */                    oiooII.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 24 */                    oiooII = new OiooII(this, iOoilo);
                        }
                    }
/* 27 */            Object objInvoke = oiooII.I00iOIl;
/* 29 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 31 */            int i2 = oiooII.I00iiO;
/* 33 */            boolean z = true;
/* 34 */            if (i2 == 0) {
/* 49 */                lIoii1l01l0i.I00000oOI(objInvoke);
/* 52 */                Ii1lIO ii1lIO = this.I00000oIO;
/* 54 */                oiooII.I00iiO = 1;
/* 56 */                objInvoke = ii1lIO.invoke(obj, oiooII);
/* 60 */                if (objInvoke == ii0111o) {
/* 62 */                    return ii0111o;
                        }
                    } else {
/* 36 */                if (i2 != 1) {
/* 44 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 47 */                    return null;
                        }
/* 38 */                lIoii1l01l0i.I00000oOI(objInvoke);
                    }
/* 69 */            if (!((Boolean) objInvoke).booleanValue()) {
/* 71 */                return Boolean.FALSE;
                    }
/* 74 */            Set set = this.I0001Ioi1lo;
/* 77 */            if (set != null) {
/* 98 */                Set set2 = set;
/* 104 */               SharedPreferences sharedPreferences = (SharedPreferences) ollO00oiil.getValue();
/* 108 */               if (!(set2 instanceof Collection) || !set2.isEmpty()) {
/* 120 */                   Iterator it = set2.iterator();
/* 128 */                   while (it.hasNext()) {
/* 140 */                       if (sharedPreferences.contains((String) it.next())) {
                                    break;
                                }
                            }
/* 96 */                    z = false;
                        }
                    } else if (((SharedPreferences) ollO00oiil.getValue()).getAll().isEmpty()) {
/* 96 */                z = false;
                    }
/* 142 */           return Boolean.valueOf(z);
                }
            }
