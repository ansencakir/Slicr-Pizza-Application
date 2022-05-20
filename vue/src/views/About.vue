<template>
  <div class="about_us_div">
     <h1 class='about-us'>
       <img src="../../public/images/alex.jpg" alt="">
       <h2 class='name'> Alex
         <a  href="https:\\linkedin.com/in/alex-rollins1/"> <img  id='linkedin-logo' src="../../public/linkedinlogo.png" alt=""></a>
         </h2>
       <p class='bio'>As a rock climber and ultramarathon runner, and amateur roboticist, I've learned to come up with creative solutions and adapt to uncontrollable circumstances on the fly.
          Whether I'm sussing out the best sequence to climb a hard route, planning the logistics for a 100 kilometer trail run, or figuring out how to build a robotic arm out of garbage,
           I'm always to find the most creative and efficient solution.
          I first discovered my passion for technology at the age of 17 as a summer intern at the Center for Biologically Inspired Robotics at Case Western Reserve University. 
          During my time there, I learned 3D modeling, programming with Arduino, and circuit design, and also co-authored my first published research paper. Ever since then, 
          I've known I wanted to work with technology.
          After graduating form tech elevator, I am looking for a junior software developer position where I can apply my existing skills and learn new ones.</p>
    </h1>
     
      <h1 class='about-us'>
       <img src="../../public/images/ansen.jpg" alt="">
       <h2 class='name'>Ansen
         <a href="https:\\linkedin.com/in/ansen-cakir/"> <img  id='linkedin-logo' src="../../public/linkedinlogo.png" alt=""></a>
       </h2>
       <p class='bio'>I am an aspiring junior developer with a thirst for knowledge and a great work ethic. I've always had a passion for all things tech, and programming is no exception. 
         I hope to find a new position as a developer where I can grow and contribute to the best of my ability. 
         I hope to be a part of one of the most important and fastest growing industries and create a positive impact.</p>
    </h1>
     
      <h1 class='about-us'>
       <img src="../../public/images/hannah.jpg" alt="">
       <h2 class='name'>Hannah 
          <a  href="https:\\linkedin.com/in/hannah-hudson93/"> <img  id='linkedin-logo' src="../../public/linkedinlogo.png" alt=""></a>
       </h2>
       <p class='bio'>I have been obsessed with syntax since I was a small child. This fascination with how language works brought me to writing: prose, poetry, comedy, games, and most recently code.
          To me, language is a sandbox, tools are toys, work is play. Problems are puzzles I get to enjoy solving. A client's need is a story I get to finish telling.
          After a recent career pivot and some intense reskill training, I am a junior software developer, 
          but I bring with me a history working in the events and higher education industries. I value collaboration, but thrive on my own, as well. 
          I may find working fun, but I take assignments and deadlines seriously.</p>
    </h1>
     
     <h1 class='about-us'>
       <img src="../../public/images/joe.jpg" alt="">
       <h2 class='name'>Joe
            <a  href="https:\\linkedin.com/in/joe-sander/"> <img  id='linkedin-logo' src="../../public/linkedinlogo.png" alt=""></a>
       </h2>
       <p class='bio'>Switching careers after 10 years of success in sales and marketing, from selling mortgages to developing search campaigns for Google Ads.
          Quick-learner and high-level collaborator, however realized my technical skills weren't where they needed to be to develop the solutions and ideas that I had in my mind. 
          To be able to see it, code it, and create it opens up a world of possibilities. 
        After years of poking around with self-teaching myself programming, I enrolled in Tech Elevator's Java bootcamp and am now learning a full-stack deck of Java technologies.
         After graduation, I'm looking for a junior developer role that will allow to me to leverage my strengths as a communicator and collaborator while building on my technical skills.</p>
    </h1>
     
     
     <h1 class='about-us'>
       <img src="../../public/images/phillip.jpg" alt="">
       <h2 class='name'>Phillip
          <a  href="https:\\linkedin.com/in/pbaucom/"> <img  id='linkedin-logo' src="../../public/linkedinlogo.png" alt=""></a>
       </h2>
       <p class='bio'>Ever since the 6th grade, I have been fascinated with technology. I loved working with tech throughout my time in school and beyond.
         So, when I become an educator I naturally wanted to teach STEM programs.  I worked with many students who cherished technology as much as I did.
          After teaching many different programs at many different grade levels, I decided it was time for me to actually venture into the tech world and reach for my goals 
          (as I have taught all my previous students to do). I have completed Tech Elevator's full-stack coding bootcamp, 
          and I am looking for a role as a junior or associate developer, or associate technical account manager. 
          Learning software development has reinvigorated my love of knowledge, and I am excited to see where the future takes me.</p>
       </h1>
  </div>
</template>

<script>
export default {

}
</script>

<style>

.bio {
  font-family: 'Poppins', sans-serif;
  font-size: 25px;
}

.about-us {
    text-align: center;
    vertical-align: center;
    font-family: "Poppins", serif;
    border: 5px solid black;
    max-width: 50%;
    min-width: 50%;
    margin: auto;
    padding-top: 20px;
    border-top: none;
}

.about_us_div {
margin: auto;
}

.name {
  display: flex;
    justify-content: center;
    align-items: center;
    font-family: "Poppins", serif;
    max-width: 84%;
}

a{
  align-self: auto;
}

#linkedin-logo{
  width: 50px;
  height: 50px;
  padding-top: 25px;
  padding-left: 25px;
}


</style>