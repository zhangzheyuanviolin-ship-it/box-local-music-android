            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            
            public final class i0i0iII extends Io0i01 {
                public static final IoloOio0I I000iOII = new IoloOio0I("ModuleInstall.API", new i0Oio1(2), new loilIl10Ii(8));

                public final o0IiOl I0000Il00O(OIiiIllOIo... oIiiIllOIoArr) {
/* 11 */            lII0I0I000I.I00000oIO("Please provide at least one OptionalModuleApi.", oIiiIllOIoArr.length > 0);
/* 15 */            for (OIiiIllOIo oIiiIllOIo : oIiiIllOIoArr) {
/* 21 */                lII0I0I000I.I000O01llI0("Requested API must not be null.", oIiiIllOIo);
                    }
/* 31 */            I11OiiIO i11OiiIOI00000oOI = I11OiiIO.I00000oOI(Arrays.asList(oIiiIllOIoArr), false);
/* 41 */            if (i11OiiIOI00000oOI.I00iOIl.isEmpty()) {
/* 48 */                return lOio0o.I0000oI00(new OI000Oo(true, 0));
                    }
/* 53 */            IolIIo0o0Iio iolIIo0o0IioI0000Il00O = IoilIilo.I0000Il00O();
/* 63 */            iolIIo0o0IioI0000Il00O.I0000O = new IlIII1l[]{iO1iIl1I0.I00000oIO};
/* 67 */            iolIIo0o0IioI0000Il00O.I00000oOI = 27301;
/* 69 */            iolIIo0o0IioI0000Il00O.I00000oIO = false;
/* 74 */            OoOlO1O0o ooOlO1O0o = new OoOlO1O0o(3);
/* 77 */            ooOlO1O0o.I00iiI = this;
/* 79 */            ooOlO1O0o.I00iiO = i11OiiIOI00000oOI;
/* 81 */            VarHandle.storeStoreFence();
/* 84 */            iolIIo0o0IioI0000Il00O.I0000Il00O = ooOlO1O0o;
/* 90 */            return I00000oOI(0, iolIIo0o0IioI0000Il00O.I00000oIO());
                }

                public final o0IiOl I0000O(Io1IlO1I1i io1IlO1I1i) {
/* 4 */             I11OiiIO i11OiiIOI00000oOI = I11OiiIO.I00000oOI(io1IlO1I1i.I00000oIO, true);
/* 15 */            if (i11OiiIOI00000oOI.I00iOIl.isEmpty()) {
/* 22 */                return lOio0o.I0000oI00(new OI00i0io0i(0, false));
                    }
/* 27 */            IolIIo0o0Iio iolIIo0o0IioI0000Il00O = IoilIilo.I0000Il00O();
/* 37 */            iolIIo0o0IioI0000Il00O.I0000O = new IlIII1l[]{iO1iIl1I0.I00000oIO};
/* 39 */            iolIIo0o0IioI0000Il00O.I00000oIO = true;
/* 43 */            iolIIo0o0IioI0000Il00O.I00000oOI = 27304;
/* 48 */            OoIOol ooIOol = new OoIOol(6);
/* 51 */            ooIOol.I00iiI = this;
/* 53 */            ooIOol.I00iiO = i11OiiIOI00000oOI;
/* 55 */            VarHandle.storeStoreFence();
/* 58 */            iolIIo0o0IioI0000Il00O.I0000Il00O = ooIOol;
/* 64 */            return I00000oOI(0, iolIIo0o0IioI0000Il00O.I00000oIO());
                }
            }
