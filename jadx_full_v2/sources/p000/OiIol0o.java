            package p000;

            import android.app.Application;
            import android.os.Bundle;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Constructor;
            import java.util.LinkedHashMap;
            
            public final class OiIol0o implements Oool0IIIO0o {
                public final Application I00000oIO;
                public Oool01i I00000oOI;
                public final Bundle I0000Il00O;
                public final I01O1lIi I0000O;
                public final I1I0i0Ilo1Oi I0000oI00;

                public OiIol0o(Application application, OiIoOoIi01 oiIoOoIi01, Bundle bundle) {
                    Oool01i oool01i;
/* 8 */             this.I0000oI00 = oiIoOoIi01.I000O01llI0();
/* 14 */            this.I0000O = oiIoOoIi01.I000iOII();
/* 16 */            this.I0000Il00O = bundle;
/* 18 */            this.I00000oIO = application;
/* 20 */            if (application != null) {
/* 22 */                oool01i = Oool01i.I0000Il00O;
/* 24 */                if (oool01i == null) {
/* 28 */                    oool01i = new Oool01i(application);
/* 31 */                    Oool01i.I0000Il00O = oool01i;
                        }
                    } else {
/* 37 */                oool01i = new Oool01i(null);
                    }
/* 40 */            this.I00000oOI = oool01i;
                }

                @Override
                public final OooioIIoi0O I00000oIO(Class cls) {
/* 1 */             String canonicalName = cls.getCanonicalName();
/* 5 */             if (canonicalName != null) {
/* 7 */                 return I0000O(cls, canonicalName);
                    }
/* 14 */            I000II.I000iOII("Local and anonymous classes can not be ViewModels");
/* 17 */            return null;
                }

                @Override
                public final OooioIIoi0O I00000oOI(Class cls, OI0l1OOllOo oI0l1OOllOo) {
/* 1 */             LinkedHashMap linkedHashMap = oI0l1OOllOo.I00000oIO;
/* 9 */             String str = (String) linkedHashMap.get(Oool0iOoooIo.I00000oOI);
/* 12 */            if (str == null) {
/* 117 */               I000II.I001IO000("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
/* 11 */                return null;
                    }
/* 20 */            if (linkedHashMap.get(OiIoII10il0.I00000oIO) == null || linkedHashMap.get(OiIoII10il0.I00000oOI) == null) {
/* 102 */               if (this.I0000O != null) {
/* 104 */                   return I0000O(cls, str);
                        }
/* 111 */               I000II.I001IO000("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
/* 11 */                return null;
                    }
/* 36 */            Application application = (Application) linkedHashMap.get(Oool01i.I0000O);
/* 40 */            boolean zIsAssignableFrom = I10O1Ol00iIi.class.isAssignableFrom(cls);
/* 57 */            Constructor constructorI00000oIO = (!zIsAssignableFrom || application == null) ? OiIolI0I0o.I00000oIO(cls, OiIolI0I0o.I00000oOI) : OiIolI0I0o.I00000oIO(cls, OiIolI0I0o.I00000oIO);
                    return constructorI00000oIO == null ? this.I00000oOI.I00000oOI(cls, oI0l1OOllOo) : (!zIsAssignableFrom || application == null) ? OiIolI0I0o.I00000oOI(cls, constructorI00000oIO, OiIoII10il0.I00000oIO(oI0l1OOllOo)) : OiIolI0I0o.I00000oOI(cls, constructorI00000oIO, application, OiIoII10il0.I00000oIO(oI0l1OOllOo));
                }

                @Override
                public final OooioIIoi0O I0000Il00O(O0IOli0o0 o0IOli0o0, OI0l1OOllOo oI0l1OOllOo) {
/* 7 */             return I00000oOI(((IOIO10iOi1) o0IOli0o0).I001l0I00(), oI0l1OOllOo);
                }

                public final OooioIIoi0O I0000O(Class cls, String str) throws NoSuchMethodException, SecurityException {
/* 1 */             I01O1lIi i01O1lIi = this.I0000O;
/* 3 */             if (i01O1lIi == null) {
/* 150 */               OoOil11Ol1o.I000OiO("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
/* 153 */               return null;
                    }
/* 7 */             boolean zIsAssignableFrom = I10O1Ol00iIi.class.isAssignableFrom(cls);
/* 11 */            Application application = this.I00000oIO;
/* 26 */            Constructor constructorI00000oIO = (!zIsAssignableFrom || application == null) ? OiIolI0I0o.I00000oIO(cls, OiIolI0I0o.I00000oOI) : OiIolI0I0o.I00000oIO(cls, OiIolI0I0o.I00000oIO);
/* 30 */            if (constructorI00000oIO == null) {
/* 32 */                if (application != null) {
/* 36 */                    return this.I00000oOI.I00000oIO(cls);
                        }
/* 41 */                Oool0iIO oool0iIO = Oool0iIO.I00000oIO;
/* 43 */                if (oool0iIO == null) {
/* 47 */                    oool0iIO = new Oool0iIO();
/* 50 */                    Oool0iIO.I00000oIO = oool0iIO;
                        }
/* 52 */                return oool0iIO.I00000oIO(cls);
                    }
/* 57 */            Bundle bundle = this.I0000Il00O;
/* 59 */            I1I0i0Ilo1Oi i1I0i0Ilo1Oi = this.I0000oI00;
/* 65 */            OiIloOOiiOii oiIloOOiiOiiI00000oIO = lO0i0I.I00000oIO(i1I0i0Ilo1Oi.I00IO1oi11O(str), bundle);
/* 71 */            OiIo0IlO1Il0 oiIo0IlO1Il0 = new OiIo0IlO1Il0();
/* 74 */            oiIo0IlO1Il0.I00iOIl = str;
/* 76 */            oiIo0IlO1Il0.I00iiI = oiIloOOiiOiiI00000oIO;
/* 78 */            VarHandle.storeStoreFence();
/* 81 */            oiIo0IlO1Il0.I00000oIO(i1I0i0Ilo1Oi, i01O1lIi);
/* 84 */            O0oOi0I o0oOi0II00ol1 = i01O1lIi.I00ol1();
/* 90 */            if (o0oOi0II00ol1 == O0oOi0I.I00iiI || o0oOi0II00ol1.I00000oIO(O0oOi0I.I00iio)) {
/* 118 */               i1I0i0Ilo1Oi.I00Ol10();
                    } else {
/* 104 */               IiI01001l1I iiI01001l1I = new IiI01001l1I(1);
/* 107 */               iiI01001l1I.I00iiI = i01O1lIi;
/* 109 */               iiI01001l1I.I00iiO = i1I0i0Ilo1Oi;
/* 111 */               VarHandle.storeStoreFence();
/* 114 */               i01O1lIi.I00li1OI(iiI01001l1I);
                    }
/* 138 */           OooioIIoi0O oooioIIoi0OI00000oOI = (!zIsAssignableFrom || application == null) ? OiIolI0I0o.I00000oOI(cls, constructorI00000oIO, oiIloOOiiOiiI00000oIO) : OiIolI0I0o.I00000oOI(cls, constructorI00000oIO, application, oiIloOOiiOiiI00000oIO);
/* 144 */           oooioIIoi0OI00000oOI.I00000oIO("androidx.lifecycle.savedstate.vm.tag", oiIo0IlO1Il0);
/* 147 */           return oooioIIoi0OI00000oOI;
                }
            }
