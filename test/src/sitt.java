import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by antz on 30/11/2016.
 */
public class sitt {
        public void autokoormad (ArrayList autodsiia, int [] DATA) {


            while (checkData(DATA)>0) {
                if (checkAutod(autodsiia, DATA)) {
                    for (int i = 0; i < autodsiia.size(); i++) {
                        if ((int) autodsiia.get(i) != 0) {

                            GetAllSubsetsByStack koormad = new GetAllSubsetsByStack((Integer) autodsiia.get(i));
                            koormad.populateSubset(DATA, 0, DATA.length);
                            koormad.toStacklist((Integer) autodsiia.get(i));
                            autole(autodsiia, i, koormad.stackslist, DATA);
                            System.out.println(autodsiia);
                            System.out.println(Arrays.toString(DATA));
                        }
                    }

                } else {
                    autodsiia.add(sumDATA(DATA));
                    clearDATA(DATA);
                    }

                }
            System.out.println("KOIK");
            }

        public void autole (ArrayList autodsiia, int autonr, ArrayList <ArrayList> stacklist, int [] DATA){
            for (int i = 0; i < stacklist.size(); i++) {
                for (int j = 0; j < stacklist.get(i).size(); j++) {
                    for (int k = 0; k < DATA.length; k++) {
                        if(DATA[k] == (int)stacklist.get(i).get(j)){
                            if ((int)autodsiia.get(autonr) != 0) {
                                autodsiia.set(autonr, ((int) autodsiia.get(autonr) - DATA[k]));
                                DATA[k] = 0;
                            }
                            }

                        }

                    }

                }

            }

            public int checkData (int [] DATA){
                int sum = 0;
                for (int i = 0; i < DATA.length; i++) {
                    sum += DATA[i];
                }
                if (sum == 0){
                    return 0;
                } else {
                    return sum;
                }
            }

            public boolean checkAutod (ArrayList autodsiia, int [] DATA){
                        if (sumAutod(autodsiia) >= sumDATA(DATA)){
                            return true;
                        } else {
                            return false;
                        }
            }

            public int sumAutod (ArrayList autodsiia){
                int sum = 0;
                for (int i = 0; i < autodsiia.size(); i++) {
                    sum += (int)autodsiia.get(i);
                }
                return sum;
            }

            public int sumDATA (int [] DATA){
                int sum = 0;
                for (int i = 0; i < DATA.length; i++) {
                   sum += DATA[i];
                }
                return sum;
            }
            public void clearDATA (int [] DATA){
                for (int i = 0; i < DATA.length; i++) {
                    DATA[i] = 0;
                }
            }
        }


