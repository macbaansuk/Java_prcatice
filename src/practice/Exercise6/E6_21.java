package practice.Exercise6;

//[6-21] Tv클래스를 주어진 로직대로 완성하시오. 완성한 후에 실행해서 주어진 실행결과와 일치하는지 확인하라.
//[참고] 코드를 단순히 하기 위해서 유효성검사는 로직에서 제외했다.
     class MyTv {
         boolean isPowerOn;
         int channel;
         int volume;
         final int MAX_VOLUME = 100;
         final int MIN_VOLUME = 0;
         final int MAX_CHANNEL = 100;
         final int MIN_CHANNEL = 1;

         void turnOnOff() {
             // (1) isPowerOn의 값이 true면 false로, false면 true로 바꾼다.
             if(isPowerOn)
                 isPowerOn = false;
             else
                 isPowerOn = true;
         }
         void volumeUp() {
            // (2) volume의 값이 MAX_VOLUME보다 작을 때만 값을 1증가시킨다.
             if(volume < MAX_VOLUME)
                 volume++;
         }
         void volumeDown() {
            // (3) volume의 값이 MIN_VOLUME보다 클 때만 값을 1감소시킨다.
             if(volume < MIN_VOLUME)
                 volume--;
         }
         void channelUp() {
            // (4) channel의 값을 1증가시킨다.
            // 만일 channel이 MAX_CHANNEL이면, channel의 값을 MIN_CHANNEL로 바꾼다.
//             channel++;
//             System.out.println("채널업의 채널값: " + channel);  채널의 값을 찍어보니 100 -> 이유: 채널을 먼저 증감식으로 값을 증가시켜놓은후에 조건문이 실행됨
             if(channel == MAX_CHANNEL)  //여기서 채널의값이 99인데 왜 이 조건문이 실행이되는거지?
                 channel = MIN_CHANNEL;
             else
                 channel++;
         }
         void channelDown() {
            // (5) channel의 값을 1감소시킨다.
            // 만일 channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL로 바꾼다.
             if(channel < MIN_CHANNEL)
                 channel = MAX_CHANNEL;
             else
                 channel--;
         }
     } // class MyTv
     class Exercise6_21 {
         public static void main(String args[]) {
             MyTv t = new MyTv();
             t.channel = 100;
             t.volume = 0;
             System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
             t.channelDown();
             t.volumeDown();
             System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
             t.volume = 100;
             t.channelUp();  //여기서 값이 100이 나와야 하는데 1이나옴 --> channelUp메소드를 확인
             t.volumeUp();
             System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
         }
 }

